package br.gov.infoconv.wsrfb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by tawan-souza on 08/11/17.
 */
@Component
public class PropertiesUtils {

    @Value("${infoconv.ws.endpoint.url.cpf}")
    private String urlEndpointCpf;

    @Value("${infoconv.ws.endpoint.url.cnpj}")
    private String urlEndpointCnpj;

    @Value("${infoconv.soap.action.value.cpf}")
    private String soapActionCpf;

    @Value("${infoconv.soap.action.value.cnpj}")
    private String soapActionCnpj;

    public String getEndpointCpf() {
        return this.urlEndpointCpf;
    }

    public String getUrlEndpointCnpj() {
        return this.urlEndpointCnpj;
    }

    public String getSoapActionCpf() {
        return this.soapActionCpf;
    }

    public String getSoapActionCnpj() {
        return this.soapActionCnpj;
    }

}
