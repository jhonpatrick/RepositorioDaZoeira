/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import dao.ServidorDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Dependentes;
import model.Endereco;
import model.Servidor;

/**
 *
 * @author Patrick Rodrigues
 */
public class RegistrarServidor {

    public static void main(String args[]) {

        Servidor s1 = new Servidor();
        ServidorDAO s1DAO = new ServidorDAO();
        Endereco end1 = new Endereco();
        List<Dependentes> lisDep = new ArrayList<Dependentes>();
        Dependentes dep1 = new Dependentes();

        s1.setNomeServ("Patrick Rodrigues");
        s1.setSIAPE("JP123");
        s1.setCargoServ("Programador Java");
        s1.setDataAdmissaoServ("12/11/2015");
        s1.setDataNascServ("15/11/1995");
        s1.setNaturalidadeServ("Imperatiz");
        s1.setSexoServ("Masculino");
        s1.setEstadoCivilServ("Solteiro");
        s1.setDeficinteFisico("Não");

        //setando o endereco do servido1 = s1
        end1.setCidade("Parnaíba");
        end1.setBairro("Centro");
        end1.setUF("PI");
        end1.setRua("Prudente de Moraes");
        end1.setNumeroCasa("1862");
        end1.setTelefone("(86) 98103-1035");
        end1.setEmail("patrickzik@outlook.com / suporte@tdainformatica.com.br / patrickrodrigueszik52@gmail.com");
        s1.setEnderecoServ(end1);

        //continuando dados do servidor
        s1.setNumCtpsServ("00998899");
        s1.setSerieCtpsServ("023");
        s1.setDataEmissaoCtpsServ("12/10/2000");
        s1.setNumPisPasepServ("023423");
        s1.setDataCadastroPisPasepServ("23/02/2013");
        s1.setIdentidadeServ("002");
        s1.setOrgaoIdentidadeServ("SSPMA");
        s1.setDataEmissaoIdentidadeServ("12/01/1990");
        s1.setNumTituloServ("0230102010120");
        s1.setNumSessaoTituloServ("23456787654");
        s1.setZonaTituloServ("MA");
        s1.setNumCpfServ("09803401207888");
        s1.setCertMilitarServ("76543456789");
        s1.setNomePaiServ("João Vila Nova da Silva");
        s1.setNomeMaeServ("Maria Aparecida Rodrigues da Silva");
        s1.setGrauInstrucaoServ("Ensino Médio - Completo");
        s1.setAreaFormacaoServ("CIENCIAS DA COMPUTAÇÃO");

        //setando a lista de dependentes do servidor
        dep1.setNomeDependente("Layla Leticia Rodrigues de Miranda");
        dep1.setDataNascimentoDependente("12/12/2000");
        dep1.setParentesco("Irmã (Chata)");
        lisDep.add(dep1);
        s1.setDependentesServ(lisDep);

        try {
            s1DAO.salvar(s1);
            JOptionPane.showMessageDialog(null, "Deu Certo!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não Deu Certo! " + e.getMessage());
        }

    }

}
