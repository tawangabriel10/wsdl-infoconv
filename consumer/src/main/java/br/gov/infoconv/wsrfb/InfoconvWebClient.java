package br.gov.infoconv.wsrfb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

/**
 * Created by basis on 06/11/17.
 */
public class InfoconvWebClient extends WebServiceGatewaySupport {

    private static final Logger LOGGER = LoggerFactory.getLogger(InfoconvWebClient.class);

    @Autowired
    private PropertiesUtils properties;

    public ConsultarCPFPDResponse getTemplateByCpf(String cpf, String cpfUsuario) {
        ConsultarCPFPD request = new ConsultarCPFPD();
        request.setListaDeCPF(cpf);
        request.setCPFUsuario(cpfUsuario);

        ConsultarCPFPDResponse response = (ConsultarCPFPDResponse) getWebServiceTemplate()
                .marshalSendAndReceive(properties.getEndpointCpf(), request, new SoapActionCallback(properties.getSoapActionCpf()));

        LOGGER.info("Recebendo Requisição:" + response);
        return response;
    }

    public ConsultarCNPJP3Response getTemplateByCnpj(String cnpj, String cpfUsuario) {
        ConsultarCNPJP3 request = new ConsultarCNPJP3();
        request.setCNPJ(cnpj);
        request.setCPFUsuario(cpfUsuario);

        ConsultarCNPJP3Response response = (ConsultarCNPJP3Response) getWebServiceTemplate()
                .marshalSendAndReceive(properties.getUrlEndpointCnpj(), request, new SoapActionCallback(properties.getSoapActionCnpj()));

        LOGGER.info("Recebendo Requisição:" + response);
        return response;
    }
}
