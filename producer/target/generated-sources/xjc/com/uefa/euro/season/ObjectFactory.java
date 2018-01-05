//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.11.06 às 10:56:55 AM BRST 
//


package com.uefa.euro.season;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.uefa.euro.season package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.uefa.euro.season
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTeamRequest }
     * 
     */
    public GetTeamRequest createGetTeamRequest() {
        return new GetTeamRequest();
    }

    /**
     * Create an instance of {@link GetTeamResponse }
     * 
     */
    public GetTeamResponse createGetTeamResponse() {
        return new GetTeamResponse();
    }

    /**
     * Create an instance of {@link Team }
     * 
     */
    public Team createTeam() {
        return new Team();
    }

}
