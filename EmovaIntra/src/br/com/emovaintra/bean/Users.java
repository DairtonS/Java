package br.com.emovaintra.bean;

public class Users {
	
	int id,codagente;
	String login, senha,nome,cargo,vip1,senhavip1,email,mmcb,obs;
	public String getSenhavip1() {
		return senhavip1;
	}
	public void setSenhavip1(String senhavip1) {
		this.senhavip1 = senhavip1;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCodagente() {
		return codagente;
	}
	public void setCodagente(int codagente) {
		this.codagente = codagente;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getVip1() {
		return vip1;
	}
	public void setVip1(String vip1) {
		this.vip1 = vip1;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMmcb() {
		return mmcb;
	}
	public void setMmcb(String mmcb) {
		this.mmcb = mmcb;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	

}
