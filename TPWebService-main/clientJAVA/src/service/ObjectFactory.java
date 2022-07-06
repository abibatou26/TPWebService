
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Create_QNAME = new QName("http://service/", "Create");
    private final static QName _CreateResponse_QNAME = new QName("http://service/", "CreateResponse");
    private final static QName _GetEtudiantsResponse_QNAME = new QName("http://service/", "getEtudiantsResponse");
    private final static QName _DeleteResponse_QNAME = new QName("http://service/", "DeleteResponse");
    private final static QName _UpdateResponse_QNAME = new QName("http://service/", "UpdateResponse");
    private final static QName _Delete_QNAME = new QName("http://service/", "Delete");
    private final static QName _Etudiant_QNAME = new QName("http://service/", "etudiant");
    private final static QName _Update_QNAME = new QName("http://service/", "Update");
    private final static QName _GetEtudiants_QNAME = new QName("http://service/", "getEtudiants");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link GetEtudiantsResponse }
     * 
     */
    public GetEtudiantsResponse createGetEtudiantsResponse() {
        return new GetEtudiantsResponse();
    }

    /**
     * Create an instance of {@link GetEtudiants }
     * 
     */
    public GetEtudiants createGetEtudiants() {
        return new GetEtudiants();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link Etudiant }
     * 
     */
    public Etudiant createEtudiant() {
        return new Etudiant();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Create }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "Create")
    public JAXBElement<Create> createCreate(Create value) {
        return new JAXBElement<Create>(_Create_QNAME, Create.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "CreateResponse")
    public JAXBElement<CreateResponse> createCreateResponse(CreateResponse value) {
        return new JAXBElement<CreateResponse>(_CreateResponse_QNAME, CreateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEtudiantsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getEtudiantsResponse")
    public JAXBElement<GetEtudiantsResponse> createGetEtudiantsResponse(GetEtudiantsResponse value) {
        return new JAXBElement<GetEtudiantsResponse>(_GetEtudiantsResponse_QNAME, GetEtudiantsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "DeleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "UpdateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "Delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Etudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "etudiant")
    public JAXBElement<Etudiant> createEtudiant(Etudiant value) {
        return new JAXBElement<Etudiant>(_Etudiant_QNAME, Etudiant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "Update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEtudiants }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getEtudiants")
    public JAXBElement<GetEtudiants> createGetEtudiants(GetEtudiants value) {
        return new JAXBElement<GetEtudiants>(_GetEtudiants_QNAME, GetEtudiants.class, null, value);
    }

}
