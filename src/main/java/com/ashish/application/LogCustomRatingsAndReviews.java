package com.ashish.application;

import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.log4j.Logger;
import org.xml.sax.InputSource;

import com.ashish.application.model.RatingsLogger;
import com.ashish.application.model.ReviewsLogger;
import com.echostar.model.vodAssets.jaxb.Review;
import com.echostar.model.vodAssets.jaxb.VodAsset;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LogCustomRatingsAndReviews {
	 private final static Logger LOGGER = Logger.getLogger(LogCustomRatingsAndReviews.class);

	public static void main (String args[]) {
		//String ratingsxml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><VodAsset xmlns:ns2=\"http://commons.model.xml.moviedata.vod.iptv.cts.bell.com\" meta-provider=\"Cinoche\" providerId=\"SuperEcran\" assetId=\"41S7V\" showType=\"Movie\" availableUntil=\"2014-06-01\" id=\"11425\"><title>L'Oubli</title><criticSummary><score count=\"11\">63</score><freshness certified=\"false\" rotten=\"false\">false</freshness></criticSummary><fanSummary><score count=\"48\" preRelease=\"false\">70</score></fanSummary><categories/><rightsIconsDisplay>DTH=1,IPT=1,MOB=0,NSC=1,WEB=0</rightsIconsDisplay><similarVodAssets><similarVodAsset providerId=\"warnerbros.com\" assetId=\"2F6GV\"/></similarVodAssets><reviews><review id=\"2009171\"><publication id=\"0\">Le Soleil</publication><date>2013-04-24</date><freshness originalScore=\"3.5/5\">none</freshness><critic id=\"0\">Éric Moreault</critic><quote>Et conclure que la finale se moque de l'intelligence du spectateur. Sur ce point, en effet, on n'y échappe pas. La dernière minute est de trop. Mais ça n'empêche pas tout le reste. À savoir, d'abord, que L'oubli joue adroitement sur les apparences.</quote></review><review id=\"2009157\"><publication id=\"0\">Joblo.com</publication><date>2013-04-19</date><freshness originalScore=\"3/5\">none</freshness><critic id=\"0\">Eric Walkuski</critic><quote>However, Oblivion has something to offer, if not in originality, then in sincerity. The film's first half has a thoughtful, solemn quality that is refreshingly devoid of the chaotic frenzy expected of a sci-fi blockbuster.</quote></review><review id=\"2009160\"><publication id=\"0\">Worst Previews</publication><date>2013-04-19</date><freshness originalScore=\"4.5/5\">none</freshness><critic id=\"0\">Dustin Putman</critic><quote>This is a ravishing, eye-popping, even groundbreaking science-fiction epic almost boundless in the kind of out-of-this-world imagery viewers will have never seen before.</quote></review><review id=\"2009145\"><publication id=\"0\">Agence QMI</publication><date>2013-04-19</date><freshness originalScore=\"3/5\">none</freshness><critic id=\"0\">Isabelle Hontebeyrie</critic><quote>Joseph Kosinski livre ici un long métrage de science-fiction qui ne manque pas d'intérêt bien qu'il ne soit qu'un mélange de films déjà vus.</quote></review><review id=\"2009151\"><publication id=\"0\">Cinéfilic</publication><date>2013-04-19</date><freshness originalScore=\"2/5\">none</freshness><critic id=\"0\">Olivier Bouchard</critic><quote>Par le fait même, Oblivion ne devient jamais un film prétentieux qui agacerait à essayer d'être ce qu'il n'est pas. Il se contente d'être un film passable qui se regarde sans problème et s'oublie aussitôt.</quote></review></reviews></VodAsset>";
		String ratingsxml = FileToSingleLineString.fileToString("/Users/ashishkumar.ashok/Projects/Bell/ratings-and-reviews/on-demand_fiftyshades_empty.xml");
		VodAsset vodAsset = null;
		JAXBContext jaxbContext;
		
		try {
			jaxbContext = JAXBContext.newInstance(VodAsset.class);
			Unmarshaller jaxbUnmarshaller;
			jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Reader reader = new InputStreamReader(new ByteArrayInputStream(ratingsxml.getBytes()),"UTF-8");
			InputSource is = new InputSource(reader);
			is.setEncoding("UTF-8");
			vodAsset = (VodAsset) jaxbUnmarshaller
			.unmarshal(is);
			RatingsLogger vodAssetLoggerModel = mapVodAssetToLoggerModel(vodAsset);
			ObjectMapper objectMapper = new ObjectMapper();
			
			System.out.println(objectMapper.writeValueAsString(vodAssetLoggerModel));
		} catch (JAXBException e) {
			LOGGER.error(e.getMessage(), e.getCause());
		} catch (UnsupportedEncodingException e) {
			LOGGER.error(e.getMessage(), e.getCause());
		} catch (JsonProcessingException e) {
			LOGGER.error(e.getMessage(), e.getCause());
		}
	
	}
	
	private static RatingsLogger mapVodAssetToLoggerModel(VodAsset vodAsset) {
		RatingsLogger vodAssetLoggerModel = new RatingsLogger();
		if(vodAsset!=null) {
			vodAssetLoggerModel.setAssetId(vodAsset.getAssetId());
			
			vodAssetLoggerModel.setMetaProvider(vodAsset.getMetaProvider());
			vodAssetLoggerModel.setCriticSummary(vodAsset.getCriticSummary());
			vodAssetLoggerModel.setFanSummary(vodAsset.getFanSummary());
			ReviewsLogger reviewLoggerModel = new ReviewsLogger();
			List<Long> reviewIds = new ArrayList<Long>();
			if (vodAsset.getReviews()!=null) {
				reviewLoggerModel.setCount(vodAsset.getReviews().getReview().size());
				for (Review review : vodAsset.getReviews().getReview()) {
					reviewIds.add(review.getId());
				}
			}
			reviewLoggerModel.setIds(reviewIds);
			vodAssetLoggerModel.setReviews(reviewLoggerModel);
		}
		return vodAssetLoggerModel;
	}
	
	
}
