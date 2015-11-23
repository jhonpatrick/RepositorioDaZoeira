/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;  

import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author Patrick Rodrigues
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Servidor.consultarPorSiape", query = "select s from Servidor s where siape = :siape")})
public class Servidor {

    private static final Logger LOG = Logger
            .getLogger(Servidor.class.getName());
	// criando ob do tipo das Classes
    // falta criar o relacionameno entre as tabelas
    // criando tabelas que vão se relcionar com a tabela Servidor
    @ManyToOne
    private Endereco enderecoServ;
    @ManyToMany
    private List<Dependentes> dependentesServ;

    private String grauInstrucaoServ;
    private String areaFormacaoServ;
    private String nomeServ;
        //Atenção esse atributo SIAPE, será o login para os Servidores entrarem na sua respectiva conta
    // criando o atributo id da tabela
    @Id
    // gerando automático
    @Column(nullable = false)
    private String SIAPE;
    private String sexoServ; // <<<<-------- Falta editar!
    private String dataNascServ;
    private String estadoCivilServ;
    private String naturalidadeServ;
    private String deficinteFisico; // <<<<<------- Mudar para boolean!
    private String nomePaiServ;
    private String nomeMaeServ;

    private String cargoServ;
    private String dataAdmissaoServ;

    private String numCtpsServ; //<<<<<<---- Mudar para String?
    private String serieCtpsServ;
    private String dataEmissaoCtpsServ;
    private String numPisPasepServ;
    private String dataCadastroPisPasepServ;
    private String identidadeServ;
    private String orgaoIdentidadeServ;
    private String dataEmissaoIdentidadeServ;
    private String numTituloServ;
    private String numSessaoTituloServ;
    private String zonaTituloServ;
    private String numCpfServ;
    private String certMilitarServ;

    public Servidor() {
        super();
    }

    public Servidor(Endereco enderecoServ, List<Dependentes> dependentesServ, String grauInstrucaoServ, String areaFormacaoServ, String SIAPE, String sexoServ, String dataNascServ, String estadoCivilServ, String naturalidadeServ, String deficinteFisico, String nomePaiServ, String nomeMaeServ, String cargoServ, String dataAdmissaoServ, String numCtpsServ, String serieCtpsServ, String dataEmissaoCtpsServ, String numPisPasepServ, String dataCadastroPisPasepServ, String identidadeServ, String orgaoIdentidadeServ, String dataEmissaoIdentidadeServ, String numTituloServ, String numSessaoTituloServ, String zonaTituloServ, String numCpfServ, String certMilitarServ) {
        this.enderecoServ = enderecoServ;
        this.dependentesServ = dependentesServ;
        this.grauInstrucaoServ = grauInstrucaoServ;
        this.areaFormacaoServ = areaFormacaoServ;
        this.SIAPE = SIAPE;
        this.sexoServ = sexoServ;
        this.dataNascServ = dataNascServ;
        this.estadoCivilServ = estadoCivilServ;
        this.naturalidadeServ = naturalidadeServ;
        this.deficinteFisico = deficinteFisico;
        this.nomePaiServ = nomePaiServ;
        this.nomeMaeServ = nomeMaeServ;
        this.cargoServ = cargoServ;
        this.dataAdmissaoServ = dataAdmissaoServ;
        this.numCtpsServ = numCtpsServ;
        this.serieCtpsServ = serieCtpsServ;
        this.dataEmissaoCtpsServ = dataEmissaoCtpsServ;
        this.numPisPasepServ = numPisPasepServ;
        this.dataCadastroPisPasepServ = dataCadastroPisPasepServ;
        this.identidadeServ = identidadeServ;
        this.orgaoIdentidadeServ = orgaoIdentidadeServ;
        this.dataEmissaoIdentidadeServ = dataEmissaoIdentidadeServ;
        this.numTituloServ = numTituloServ;
        this.numSessaoTituloServ = numSessaoTituloServ;
        this.zonaTituloServ = zonaTituloServ;
        this.numCpfServ = numCpfServ;
        this.certMilitarServ = certMilitarServ;
    }

    public Servidor(Endereco enderecoServ, List<Dependentes> dependentesServ, String grauInstrucaoServ, String areaFormacaoServ, String sexoServ, String dataNascServ, String estadoCivilServ, String naturalidadeServ, String deficinteFisico, String nomePaiServ, String nomeMaeServ, String cargoServ, String dataAdmissaoServ, String numCtpsServ, String serieCtpsServ, String dataEmissaoCtpsServ, String numPisPasepServ, String dataCadastroPisPasepServ, String identidadeServ, String orgaoIdentidadeServ, String dataEmissaoIdentidadeServ, String numTituloServ, String numSessaoTituloServ, String zonaTituloServ, String numCpfServ, String certMilitarServ) {
        this.enderecoServ = enderecoServ;
        this.dependentesServ = dependentesServ;
        this.grauInstrucaoServ = grauInstrucaoServ;
        this.areaFormacaoServ = areaFormacaoServ;
        this.sexoServ = sexoServ;
        this.dataNascServ = dataNascServ;
        this.estadoCivilServ = estadoCivilServ;
        this.naturalidadeServ = naturalidadeServ;
        this.deficinteFisico = deficinteFisico;
        this.nomePaiServ = nomePaiServ;
        this.nomeMaeServ = nomeMaeServ;
        this.cargoServ = cargoServ;
        this.dataAdmissaoServ = dataAdmissaoServ;
        this.numCtpsServ = numCtpsServ;
        this.serieCtpsServ = serieCtpsServ;
        this.dataEmissaoCtpsServ = dataEmissaoCtpsServ;
        this.numPisPasepServ = numPisPasepServ;
        this.dataCadastroPisPasepServ = dataCadastroPisPasepServ;
        this.identidadeServ = identidadeServ;
        this.orgaoIdentidadeServ = orgaoIdentidadeServ;
        this.dataEmissaoIdentidadeServ = dataEmissaoIdentidadeServ;
        this.numTituloServ = numTituloServ;
        this.numSessaoTituloServ = numSessaoTituloServ;
        this.zonaTituloServ = zonaTituloServ;
        this.numCpfServ = numCpfServ;
        this.certMilitarServ = certMilitarServ;
    }
    
    public Endereco getEnderecoServ() {
        return enderecoServ;
    }

    public void setEnderecoServ(Endereco enderecoServ) {
        this.enderecoServ = enderecoServ;
    }

    public List<Dependentes> getDependentesServ() {
        return dependentesServ;
    }

    public void setDependentesServ(List<Dependentes> dependentesServ) {
        this.dependentesServ = dependentesServ;
    }

    public String getAreaFormacaoServ() {
        return areaFormacaoServ;
    }

    public void setAreaFormacaoServ(String areaFormacaoServ) {
        this.areaFormacaoServ = areaFormacaoServ;
    }

    public String getSIAPE() {
        return SIAPE;
    }

    public void setSIAPE(String SIAPE) {
        this.SIAPE = SIAPE;
    }

    public String getGrauInstrucaoServ() {
        return grauInstrucaoServ;
    }

    public void setGrauInstrucaoServ(String grauInstrucaoServ) {
        this.grauInstrucaoServ = grauInstrucaoServ;
    }

    public String getNomeServ() {
        return nomeServ;
    }

    public void setNomeServ(String nomeServ) {
        this.nomeServ = nomeServ;
    }

    public String getSexoServ() {
        return sexoServ;
    }

    public void setSexoServ(String sexoServ) {
        this.sexoServ = sexoServ;
    }

    public String getDataNascServ() {
        return dataNascServ;
    }

    public void setDataNascServ(String dataNascServ) {
        this.dataNascServ = dataNascServ;
    }

    public String getEstadoCivilServ() {
        return estadoCivilServ;
    }

    public void setEstadoCivilServ(String estadoCivilServ) {
        this.estadoCivilServ = estadoCivilServ;
    }

    public String getNaturalidadeServ() {
        return naturalidadeServ;
    }

    public void setNaturalidadeServ(String naturalidadeServ) {
        this.naturalidadeServ = naturalidadeServ;
    }

    public String isDeficinteFisico() {
        return deficinteFisico;
    }

    public void setDeficinteFisico(String deficinteFisico) {

        this.deficinteFisico = deficinteFisico;
    }

    public String getNomePaiServ() {
        return nomePaiServ;
    }

    public void setNomePaiServ(String nomePaiServ) {
        this.nomePaiServ = nomePaiServ;
    }

    public String getNomeMaeServ() {
        return nomeMaeServ;
    }

    public void setNomeMaeServ(String nomeMaeServ) {
        this.nomeMaeServ = nomeMaeServ;
    }

    public String getCargoServ() {
        return cargoServ;
    }

    public void setCargoServ(String cargoServ) {
        this.cargoServ = cargoServ;
    }

    public String getDataAdmissaoServ() {
        return dataAdmissaoServ;
    }

    public void setDataAdmissaoServ(String dataAdmissaoServ) {
        this.dataAdmissaoServ = dataAdmissaoServ;
    }

    public String getNumCtpsServ() {
        return numCtpsServ;
    }

    public void setNumCtpsServ(String numCtpsServ) {
        this.numCtpsServ = numCtpsServ;
    }

    public String getSerieCtpsServ() {
        return serieCtpsServ;
    }

    public void setSerieCtpsServ(String serieCtpsServ) {
        this.serieCtpsServ = serieCtpsServ;
    }

    public String getDataEmissaoCtpsServ() {
        return dataEmissaoCtpsServ;
    }

    public void setDataEmissaoCtpsServ(String dataEmissaoCtpsServ) {
        this.dataEmissaoCtpsServ = dataEmissaoCtpsServ;
    }

    public String getNumPisPasepServ() {
        return numPisPasepServ;
    }

    public void setNumPisPasepServ(String numPisPasepServ) {
        this.numPisPasepServ = numPisPasepServ;
    }

    public String getDataCadastroPisPasepServ() {
        return dataCadastroPisPasepServ;
    }

    public void setDataCadastroPisPasepServ(String dataCadastroPisPasepServ) {

        this.dataCadastroPisPasepServ = dataCadastroPisPasepServ;
    }

    public String getIdentidadeServ() {
        return identidadeServ;
    }

    public void setIdentidadeServ(String identidadeServ) {
        this.identidadeServ = identidadeServ;
    }

    public String getOrgaoIdentidadeServ() {
        return orgaoIdentidadeServ;
    }

    public void setOrgaoIdentidadeServ(String orgaoIdentidadeServ) {
        this.orgaoIdentidadeServ = orgaoIdentidadeServ;
    }

    public String getDataEmissaoIdentidadeServ() {
        return dataEmissaoIdentidadeServ;
    }

    public void setDataEmissaoIdentidadeServ(String dataEmissaoIdentidadeServ) {
        this.dataEmissaoIdentidadeServ = dataEmissaoIdentidadeServ;
    }

    public String getNumTituloServ() {
        return numTituloServ;
    }

    public void setNumTituloServ(String numTituloServ) {
        this.numTituloServ = numTituloServ;
    }

    public String getNumSessaoTituloServ() {
        return numSessaoTituloServ;
    }

    public void setNumSessaoTituloServ(String numSessaoTituloServ) {
        this.numSessaoTituloServ = numSessaoTituloServ;
    }

    public String getZonaTituloServ() {
        return zonaTituloServ;
    }

    public void setZonaTituloServ(String zonaTituloServ) {
        this.zonaTituloServ = zonaTituloServ;
    }

    public String getNumCpfServ() {
        return numCpfServ;
    }

    public void setNumCpfServ(String numCpfServ) {
        this.numCpfServ = numCpfServ;
    }

    public String getCertMilitarServ() {
        return certMilitarServ;
    }

    public void setCertMilitarServ(String certMilitarServ) {
        this.certMilitarServ = certMilitarServ;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.SIAPE);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Servidor other = (Servidor) obj;
        if (!Objects.equals(this.SIAPE, other.SIAPE)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Servidor{ Endereço do Servidor= " + enderecoServ + ",\n"
                + " Dependentes do Servidor= " + dependentesServ + ", Grau de Instrução do Servidor= " + grauInstrucaoServ + ",\n"
                + " Área de formação do Servidor= " + areaFormacaoServ + ", Nome do Servidor=" + nomeServ + ",\n"
                + " Sexo do Servidor= " + sexoServ + ", Data de Nascimento do Servidor= " + dataNascServ + ",\n"
                + " Estado Civil do Servidor= " + estadoCivilServ + ", Naturalidade do Servidor= " + naturalidadeServ + ",\n"
                + " Deficinte Fisico= " + deficinteFisico + ", Nome do Pai do Servidor= " + nomePaiServ + ",\n"
                + " Nome da Mãe do Servidor= " + nomeMaeServ + ", Cargo do Servidor= " + cargoServ + ",\n"
                + " Data de Admissão do Servidor= " + dataAdmissaoServ + ", Número do Ctps do Servidor= " + numCtpsServ + ",\n"
                + " Número do PIS/PASEP do Servidor= " + numPisPasepServ + ", Data de Cadastro do PIS/PASEP do Servidor= " + dataCadastroPisPasepServ + ",\n"
                + " Número da Identidade do Servidor= " + identidadeServ + ", Orgão da Identidade do Servidor= " + orgaoIdentidadeServ + ",\n"
                + " Data de Emissão da Identidade do Servidor= " + dataEmissaoIdentidadeServ + ", Número do Título do Servidor= " + numTituloServ + "\n"
                + " Número da Sessão do Título do Servidor= " + numSessaoTituloServ + ", Zona do Título do Servidor= " + zonaTituloServ + ",\n"
                + " Número do CPF do Servidor= " + numCpfServ + ", Certidão Militar do Servidor= " + certMilitarServ + " }";
    }
}
