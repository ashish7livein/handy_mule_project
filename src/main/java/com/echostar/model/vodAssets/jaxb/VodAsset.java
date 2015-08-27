//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.22 at 11:34:53 AM MDT 
//


package com.echostar.model.vodAssets.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.echostar.model.vodAssets.jaxb.VodAsset.Categories;
import com.echostar.model.vodAssets.jaxb.VodAsset.Reviews;
import com.echostar.model.vodAssets.jaxb.VodAsset.SimilarVodAssets;


/**
 * <p>Java class for VodAsset element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="VodAsset">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;extension base="{}movie">
 *         &lt;sequence>
 *           &lt;element name="categories" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="category" type="{}category" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="rightsIconsDisplay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="similarVodAssets">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="similarVodAsset" type="{}similarVodAsset" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="reviews" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="review" type="{http://commons.model.xml.moviedata.vod.iptv.cts.bell.com}review" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *         &lt;attribute name="assetId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="availableUntil" type="{http://www.w3.org/2001/XMLSchema}date" />
 *         &lt;attribute name="dthAvailableUntil" type="{http://www.w3.org/2001/XMLSchema}date" />
 *         &lt;attribute name="episodeId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="meta-provider" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="providerId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="seriesId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="showType" type="{}showType" />
 *       &lt;/extension>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "categories",
    "rightsIconsDisplay",
    "similarVodAssets",
    "reviews"
})
@XmlRootElement(name = "VodAsset")
public class VodAsset
    extends Movie
{

    protected Categories categories;
    protected String rightsIconsDisplay;
    @XmlElement(required = true)
    protected SimilarVodAssets similarVodAssets;
    protected Reviews reviews;
    @XmlAttribute(required = true)
    protected String assetId;
    @XmlAttribute
    protected XMLGregorianCalendar availableUntil;
    @XmlAttribute
    protected XMLGregorianCalendar dthAvailableUntil;
    @XmlAttribute
    protected String episodeId;
    @XmlAttribute(name = "meta-provider")
    protected String metaProvider;
    @XmlAttribute(required = true)
    protected String providerId;
    @XmlAttribute
    protected String seriesId;
    @XmlAttribute
    protected ShowType showType;

    /**
     * Gets the value of the categories property.
     * 
     * @return
     *     possible object is
     *     {@link Categories }
     *     
     */
    public Categories getCategories() {
        return categories;
    }

    /**
     * Sets the value of the categories property.
     * 
     * @param value
     *     allowed object is
     *     {@link Categories }
     *     
     */
    public void setCategories(Categories value) {
        this.categories = value;
    }

    /**
     * Gets the value of the rightsIconsDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightsIconsDisplay() {
        return rightsIconsDisplay;
    }

    /**
     * Sets the value of the rightsIconsDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightsIconsDisplay(String value) {
        this.rightsIconsDisplay = value;
    }

    /**
     * Gets the value of the similarVodAssets property.
     * 
     * @return
     *     possible object is
     *     {@link SimilarVodAssets }
     *     
     */
    public SimilarVodAssets getSimilarVodAssets() {
        return similarVodAssets;
    }

    /**
     * Sets the value of the similarVodAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimilarVodAssets }
     *     
     */
    public void setSimilarVodAssets(SimilarVodAssets value) {
        this.similarVodAssets = value;
    }

    /**
     * Gets the value of the reviews property.
     * 
     * @return
     *     possible object is
     *     {@link Reviews }
     *     
     */
    public Reviews getReviews() {
        return reviews;
    }

    /**
     * Sets the value of the reviews property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reviews }
     *     
     */
    public void setReviews(Reviews value) {
        this.reviews = value;
    }

    /**
     * Gets the value of the assetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetId() {
        return assetId;
    }

    /**
     * Sets the value of the assetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetId(String value) {
        this.assetId = value;
    }

    /**
     * Gets the value of the availableUntil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAvailableUntil() {
        return availableUntil;
    }

    /**
     * Sets the value of the availableUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAvailableUntil(XMLGregorianCalendar value) {
        this.availableUntil = value;
    }

    /**
     * Gets the value of the dthAvailableUntil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDthAvailableUntil() {
        return dthAvailableUntil;
    }

    /**
     * Sets the value of the dthAvailableUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDthAvailableUntil(XMLGregorianCalendar value) {
        this.dthAvailableUntil = value;
    }

    /**
     * Gets the value of the episodeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEpisodeId() {
        return episodeId;
    }

    /**
     * Sets the value of the episodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEpisodeId(String value) {
        this.episodeId = value;
    }

    /**
     * Gets the value of the metaProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaProvider() {
        return metaProvider;
    }

    /**
     * Sets the value of the metaProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaProvider(String value) {
        this.metaProvider = value;
    }

    /**
     * Gets the value of the providerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderId() {
        return providerId;
    }

    /**
     * Sets the value of the providerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderId(String value) {
        this.providerId = value;
    }

    /**
     * Gets the value of the seriesId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriesId() {
        return seriesId;
    }

    /**
     * Sets the value of the seriesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriesId(String value) {
        this.seriesId = value;
    }

    /**
     * Gets the value of the showType property.
     * 
     * @return
     *     possible object is
     *     {@link ShowType }
     *     
     */
    public ShowType getShowType() {
        return showType;
    }

    /**
     * Sets the value of the showType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowType }
     *     
     */
    public void setShowType(ShowType value) {
        this.showType = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="category" type="{}category" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "category"
    })
    public static class Categories {

        @XmlElement(required = true)
        protected List<Category> category;

        /**
         * Gets the value of the category property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the category property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCategory().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Category }
         * 
         * 
         */
        public List<Category> getCategory() {
            if (category == null) {
                category = new ArrayList<Category>();
            }
            return this.category;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="review" type="{http://commons.model.xml.moviedata.vod.iptv.cts.bell.com}review" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "review"
    })
    public static class Reviews {

        @XmlElement(required = true)
        protected List<Review> review;

        /**
         * Gets the value of the review property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the review property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReview().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Review }
         * 
         * 
         */
        public List<Review> getReview() {
            if (review == null) {
                review = new ArrayList<Review>();
            }
            return this.review;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="similarVodAsset" type="{}similarVodAsset" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "similarVodAsset"
    })
    public static class SimilarVodAssets {

        @XmlElement(required = true)
        protected List<SimilarVodAsset> similarVodAsset;

        /**
         * Gets the value of the similarVodAsset property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the similarVodAsset property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSimilarVodAsset().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SimilarVodAsset }
         * 
         * 
         */
        public List<SimilarVodAsset> getSimilarVodAsset() {
            if (similarVodAsset == null) {
                similarVodAsset = new ArrayList<SimilarVodAsset>();
            }
            return this.similarVodAsset;
        }

    }

}