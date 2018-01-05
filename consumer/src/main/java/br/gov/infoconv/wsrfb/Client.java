package br.gov.infoconv.wsrfb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.ws.WebServiceException;

import java.util.List;

/**
 * @author Zoltan Altfatter
 */
@SpringBootApplication
public class Client {

    private static final String CPF_TESTE = "31544622287;31544630115;31544649304;31544886268;31580572200;31581676468;33722277353;33760241387;83121064053;00305727036;31545688834;31545866791;31547931000;31548660787;31549080806;31549756834;31549861700;31545912300;31550630768;31561900125;31544622104;31544622368;31544622791;31544622872;31544630700;31544649215;31544649487;31544649649;31544657234;31544657668;31546153772;31546986715;31547869887;31548180815;31554172853;31555195849;31556221800;31544894791;31553737768;31558410872;31545190097;31545220263;31545840644;31546650300;31549578472;31549713787;31551521091;31552218791;31553907787;31554652553;31544622520;31544649134;31544690363;31544827253;31544886349;31545033820;31545041504;31545068100;31545122253;31545165300;31648991220;33433763020;33533024091;34013750759;34118730278;34155279720;34354301849;34354476800;34504125315;34687041191;31545262268;31545521700;31547087315;31549136291;31550576291;31556590334;31558852387;31559620706;31560989220;31562523015";
    private static final String CPF_USUARIO_TESTE = "79506240949";
    private static final String CNPJ_TESTE = "60701190000104";

    private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        SpringApplication.run(Client.class);
    }

    /*@Bean
    CommandLineRunner lookup(InfoconvWebClient teamClient) {
        return args -> {
            String cpf = CPF_TESTE;
            try {
                ConsultarCPFPDResponse response = teamClient.getTemplateByCpf(CPF_USUARIO_TESTE, CPF_USUARIO_TESTE);
                ArrayOfPessoaPerfilD arrayPessoa = response.getConsultarCPFPDResult();
                if (arrayPessoa != null) {

                    List<PessoaPerfilD> listaPessoa = arrayPessoa.getPessoaPerfilD();

                    if (listaPessoa != null && !listaPessoa.isEmpty()) {
                        listaPessoa.forEach(pessoa -> {
                            LOGGER.info("CPF: '{}', Nome: '{}', Situacao cadastral:'{}', Nome Mãe:'{}', Erro: '{}'",
                                    pessoa.getCPF(), pessoa.getNome(), pessoa.getSituacaoCadastral(), pessoa.getNomeMae(), pessoa.getErro());
                        });
                    }
                }
            } catch (WebServiceException e) {
                LOGGER.error(e.getMessage(), e);
            }
        };
    }*/


    @Bean
    CommandLineRunner lookup(InfoconvWebClient teamClient) {
        return args -> {
            String cpf = CPF_TESTE;
            try {
                ConsultarCNPJP3Response response = teamClient.getTemplateByCnpj(CNPJ_TESTE, CPF_USUARIO_TESTE);
                ArrayOfCNPJPerfil3 arrayPessoa = response.getConsultarCNPJP3Result();
                if (arrayPessoa != null) {

                    List<CNPJPerfil3> listaPessoa = arrayPessoa.getCNPJPerfil3();

                    if (listaPessoa != null && !listaPessoa.isEmpty()) {
                        LOGGER.info("CNPJ: '{}', Estabelecimento: '{}', Situacao cadastral:'{}', Capital Social:'{}'",
                                listaPessoa.get(0).getCNPJ(), listaPessoa.get(0).getEstabelecimento(), listaPessoa.get(0).getSituacaoCadastral(), listaPessoa.get(0).getCapitalSocial());
                    }
                }
            } catch (WebServiceException e) {
                LOGGER.error(e.getMessage(), e);
            }
        };
    }
}
