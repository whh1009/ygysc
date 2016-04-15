package com.svw.uc.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.svw.uc.ws package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _QueryAuthProduct_QNAME = new QName("http://ws.uc.svw.com/", "queryAuthProduct");
	private final static QName _QueryDealer_QNAME = new QName("http://ws.uc.svw.com/", "queryDealer");
	private final static QName _QueryMakeResponse_QNAME = new QName("http://ws.uc.svw.com/", "queryMakeResponse");
	private final static QName _QuerySeries_QNAME = new QName("http://ws.uc.svw.com/", "querySeries");
	private final static QName _QuerySeriesResponse_QNAME = new QName("http://ws.uc.svw.com/", "querySeriesResponse");
	private final static QName _QueryBrandResponse_QNAME = new QName("http://ws.uc.svw.com/", "queryBrandResponse");
	private final static QName _QueryMake_QNAME = new QName("http://ws.uc.svw.com/", "queryMake");
	private final static QName _QueryModel_QNAME = new QName("http://ws.uc.svw.com/", "queryModel");
	private final static QName _QueryModelResponse_QNAME = new QName("http://ws.uc.svw.com/", "queryModelResponse");
	private final static QName _QueryAuthProductResponse_QNAME = new QName("http://ws.uc.svw.com/", "queryAuthProductResponse");
	private final static QName _QueryBrand_QNAME = new QName("http://ws.uc.svw.com/", "queryBrand");
	private final static QName _QueryDealerResponse_QNAME = new QName("http://ws.uc.svw.com/", "queryDealerResponse");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.svw.uc.ws
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link QueryModelResponse }
	 * 
	 */
	public QueryModelResponse createQueryModelResponse() {
		return new QueryModelResponse();
	}

	/**
	 * Create an instance of {@link AuthProduct }
	 * 
	 */
	public AuthProduct createAuthProduct() {
		return new AuthProduct();
	}

	/**
	 * Create an instance of {@link QuerySeriesResponse }
	 * 
	 */
	public QuerySeriesResponse createQuerySeriesResponse() {
		return new QuerySeriesResponse();
	}

	/**
	 * Create an instance of {@link Make }
	 * 
	 */
	public Make createMake() {
		return new Make();
	}

	/**
	 * Create an instance of {@link QuerySeries }
	 * 
	 */
	public QuerySeries createQuerySeries() {
		return new QuerySeries();
	}

	/**
	 * Create an instance of {@link Series }
	 * 
	 */
	public Series createSeries() {
		return new Series();
	}

	/**
	 * Create an instance of {@link Brand }
	 * 
	 */
	public Brand createBrand() {
		return new Brand();
	}

	/**
	 * Create an instance of {@link QueryBrand }
	 * 
	 */
	public QueryBrand createQueryBrand() {
		return new QueryBrand();
	}

	/**
	 * Create an instance of {@link QueryAuthProductResponse }
	 * 
	 */
	public QueryAuthProductResponse createQueryAuthProductResponse() {
		return new QueryAuthProductResponse();
	}

	/**
	 * Create an instance of {@link Model }
	 * 
	 */
	public Model createModel() {
		return new Model();
	}

	/**
	 * Create an instance of {@link Dealer }
	 * 
	 */
	public Dealer createDealer() {
		return new Dealer();
	}

	/**
	 * Create an instance of {@link QueryDealer }
	 * 
	 */
	public QueryDealer createQueryDealer() {
		return new QueryDealer();
	}

	/**
	 * Create an instance of {@link QueryModel }
	 * 
	 */
	public QueryModel createQueryModel() {
		return new QueryModel();
	}

	/**
	 * Create an instance of {@link QueryAuthProduct }
	 * 
	 */
	public QueryAuthProduct createQueryAuthProduct() {
		return new QueryAuthProduct();
	}

	/**
	 * Create an instance of {@link QueryMakeResponse }
	 * 
	 */
	public QueryMakeResponse createQueryMakeResponse() {
		return new QueryMakeResponse();
	}

	/**
	 * Create an instance of {@link QueryDealerResponse }
	 * 
	 */
	public QueryDealerResponse createQueryDealerResponse() {
		return new QueryDealerResponse();
	}

	/**
	 * Create an instance of {@link QueryMake }
	 * 
	 */
	public QueryMake createQueryMake() {
		return new QueryMake();
	}

	/**
	 * Create an instance of {@link QueryBrandResponse }
	 * 
	 */
	public QueryBrandResponse createQueryBrandResponse() {
		return new QueryBrandResponse();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link QueryAuthProduct }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.uc.svw.com/", name = "queryAuthProduct")
	public JAXBElement<QueryAuthProduct> createQueryAuthProduct(QueryAuthProduct value) {
		return new JAXBElement<QueryAuthProduct>(_QueryAuthProduct_QNAME, QueryAuthProduct.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link QueryDealer }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.uc.svw.com/", name = "queryDealer")
	public JAXBElement<QueryDealer> createQueryDealer(QueryDealer value) {
		return new JAXBElement<QueryDealer>(_QueryDealer_QNAME, QueryDealer.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link QueryMakeResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.uc.svw.com/", name = "queryMakeResponse")
	public JAXBElement<QueryMakeResponse> createQueryMakeResponse(QueryMakeResponse value) {
		return new JAXBElement<QueryMakeResponse>(_QueryMakeResponse_QNAME, QueryMakeResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link QuerySeries }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.uc.svw.com/", name = "querySeries")
	public JAXBElement<QuerySeries> createQuerySeries(QuerySeries value) {
		return new JAXBElement<QuerySeries>(_QuerySeries_QNAME, QuerySeries.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link QuerySeriesResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.uc.svw.com/", name = "querySeriesResponse")
	public JAXBElement<QuerySeriesResponse> createQuerySeriesResponse(QuerySeriesResponse value) {
		return new JAXBElement<QuerySeriesResponse>(_QuerySeriesResponse_QNAME, QuerySeriesResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link QueryBrandResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.uc.svw.com/", name = "queryBrandResponse")
	public JAXBElement<QueryBrandResponse> createQueryBrandResponse(QueryBrandResponse value) {
		return new JAXBElement<QueryBrandResponse>(_QueryBrandResponse_QNAME, QueryBrandResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link QueryMake }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.uc.svw.com/", name = "queryMake")
	public JAXBElement<QueryMake> createQueryMake(QueryMake value) {
		return new JAXBElement<QueryMake>(_QueryMake_QNAME, QueryMake.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link QueryModel }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.uc.svw.com/", name = "queryModel")
	public JAXBElement<QueryModel> createQueryModel(QueryModel value) {
		return new JAXBElement<QueryModel>(_QueryModel_QNAME, QueryModel.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link QueryModelResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.uc.svw.com/", name = "queryModelResponse")
	public JAXBElement<QueryModelResponse> createQueryModelResponse(QueryModelResponse value) {
		return new JAXBElement<QueryModelResponse>(_QueryModelResponse_QNAME, QueryModelResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link QueryAuthProductResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.uc.svw.com/", name = "queryAuthProductResponse")
	public JAXBElement<QueryAuthProductResponse> createQueryAuthProductResponse(QueryAuthProductResponse value) {
		return new JAXBElement<QueryAuthProductResponse>(_QueryAuthProductResponse_QNAME, QueryAuthProductResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link QueryBrand }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.uc.svw.com/", name = "queryBrand")
	public JAXBElement<QueryBrand> createQueryBrand(QueryBrand value) {
		return new JAXBElement<QueryBrand>(_QueryBrand_QNAME, QueryBrand.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link QueryDealerResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.uc.svw.com/", name = "queryDealerResponse")
	public JAXBElement<QueryDealerResponse> createQueryDealerResponse(QueryDealerResponse value) {
		return new JAXBElement<QueryDealerResponse>(_QueryDealerResponse_QNAME, QueryDealerResponse.class, null, value);
	}

}
