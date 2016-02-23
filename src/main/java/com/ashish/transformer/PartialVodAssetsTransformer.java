package com.ashish.transformer;

import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mule.DefaultMessageCollection;
import org.mule.DefaultMuleMessage;
import org.mule.api.MuleContext;
import org.mule.api.MuleMessage;
import org.mule.api.MuleMessageCollection;
import org.mule.api.context.MuleContextAware;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;
import org.xml.sax.InputSource;

import com.echostar.model.partialVodAssets.jaxb.PartialVodAsset;
import com.echostar.model.partialVodAssets.jaxb.PartialVodAssets;

public class PartialVodAssetsTransformer extends AbstractMessageTransformer implements MuleContextAware{

	
	protected MuleContext muleContext;
	
	private static final Logger LOGGER = LogManager.getLogger(PartialVodAssetsTransformer.class);
	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding)
			throws TransformerException {
		byte[] byteArray = null;
		try {
			byteArray = message.getPayloadAsBytes();
		} catch (Exception e1) {
			e1.printStackTrace();
			LOGGER.error(e1.getLocalizedMessage());
		}
		MuleMessageCollection muleMessageCollection = new DefaultMessageCollection(muleContext);
		PartialVodAssets partialVodAssets = transformAssetMetadataToObject (byteArray);
		for (PartialVodAsset partialVodAsset : partialVodAssets.getPartialVodAsset()) {
			MuleMessage muleMessage = new DefaultMuleMessage(partialVodAsset, muleContext);
			muleMessageCollection.addMessage(muleMessage);
		}
		
		
		return muleMessageCollection;
	}
	
	public PartialVodAssets transformAssetMetadataToObject (byte[] byteArray) {
		JAXBContext jaxbContext;
		PartialVodAssets partialVodAssets = null;
		try {
			jaxbContext = JAXBContext.newInstance(PartialVodAssets.class);
			Unmarshaller jaxbUnmarshaller;
			jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Reader reader = new InputStreamReader(new ByteArrayInputStream(byteArray),"UTF-8");
			InputSource is = new InputSource(reader);
			is.setEncoding("UTF-8");
			partialVodAssets = (PartialVodAssets) jaxbUnmarshaller
					.unmarshal(is);
		} catch (JAXBException e) {
			LOGGER.debug("Failed to transform Asset Metadata XML into a JAXB Object");
			LOGGER.error("Fill in stack trace:",e.fillInStackTrace());
			LOGGER.error(e.getLocalizedMessage());
		} catch (UnsupportedEncodingException e) {
			LOGGER.debug("Failed to transform Asset Metadata XML into a JAXB Object");
			LOGGER.error("Fill in stack trace:",e.fillInStackTrace());
			LOGGER.error(e.getLocalizedMessage());
		}
		return partialVodAssets;
	}

	@Override
	public void setMuleContext (MuleContext context) {
		this.muleContext = context;
	}
	
}
