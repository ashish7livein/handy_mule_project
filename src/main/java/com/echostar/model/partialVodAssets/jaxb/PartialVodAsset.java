//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.10 at 03:47:41 PM GMT 
//


package com.echostar.model.partialVodAssets.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.echostar.model.partialVodAssets.jaxb.PartialVodAsset.Reviews;
import com.echostar.model.partialVodAssets.jaxb.PartialVodAsset.VodRecommendations;


/**
 * <p>Java class for partialVodAsset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="partialVodAsset">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="criticSummary" type="{}criticSummary" minOccurs="0"/>
 *         &lt;element name="fanSummary" type="{}fanSummary" minOccurs="0"/>
 *         &lt;element name="vodRecommendations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;sequence>
 *                     &lt;element name="recommendation" type="{}recommendation" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="reviews" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="review" type="{http://commons.model.xml.moviedata.vod.iptv.cts.bell.com}review" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="assetId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="meta-provider" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="providerId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partialVodAsset", propOrder = {
    "criticSummary",
    "fanSummary",
    "vodRecommendations",
    "reviews"
})
public class PartialVodAsset implements Serializable {

    protected CriticSummary criticSummary;
    protected FanSummary fanSummary;
    protected VodRecommendations vodRecommendations;
    protected Reviews reviews;
    @XmlAttribute(required = true)
    protected String assetId;
    @XmlAttribute(name = "meta-provider")
    protected String metaProvider;
    @XmlAttribute(required = true)
    protected String providerId;

    /**
     * Gets the value of the criticSummary property.
     * 
     * @return
     *     possible object is
     *     {@link CriticSummary }
     *     
     */
    public CriticSummary getCriticSummary() {
        return criticSummary;
    }

    /**
     * Sets the value of the criticSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriticSummary }
     *     
     */
    public void setCriticSummary(CriticSummary value) {
        this.criticSummary = value;
    }

    /**
     * Gets the value of the fanSummary property.
     * 
     * @return
     *     possible object is
     *     {@link FanSummary }
     *     
     */
    public FanSummary getFanSummary() {
        return fanSummary;
    }

    /**
     * Sets the value of the fanSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link FanSummary }
     *     
     */
    public void setFanSummary(FanSummary value) {
        this.fanSummary = value;
    }

    /**
     * Gets the value of the vodRecommendations property.
     * 
     * @return
     *     possible object is
     *     {@link VodRecommendations }
     *     
     */
    public VodRecommendations getVodRecommendations() {
        return vodRecommendations;
    }

    /**
     * Sets the value of the vodRecommendations property.
     * 
     * @param value
     *     allowed object is
     *     {@link VodRecommendations }
     *     
     */
    public void setVodRecommendations(VodRecommendations value) {
        this.vodRecommendations = value;
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
    public static class Reviews implements Serializable {

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
     *         &lt;sequence>
     *           &lt;element name="recommendation" type="{}recommendation" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;/sequence>
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
        "recommendation"
    })
    public static class VodRecommendations implements Serializable {

        @XmlElement(required = true)
        protected List<Recommendation> recommendation;

        /**
         * Gets the value of the recommendation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the recommendation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecommendation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Recommendation }
         * 
         * 
         */
        public List<Recommendation> getRecommendation() {
            if (recommendation == null) {
                recommendation = new ArrayList<Recommendation>();
            }
            return this.recommendation;
        }

    }

}
