package com.nathan.needhelp.entities;

import java.sql.Blob;
import java.sql.Timestamp;
import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuarios {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String email;
	@Column
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String password;
	@Column
	private String nome;
	@Column
	private String sobrenome;
	@Column
	private String cidade;
	@Column
	private String uf;
	@Column
	private String pais;
	@Column
	private String endereco;
	@Column
	private Date data_Nascimento;
	@Column
	private String skypeid;
	@Column
	private String telefone;
	@Column
	private boolean confirmado;
	@Column
	private Blob foto;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Date getDataNascimento() {
		return data_Nascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.data_Nascimento = dataNascimento;
	}
	public String getSkypeId() {
		return skypeid;
	}
	public void setSkypeId(String skypeId) {
		this.skypeid = skypeId;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public boolean isConfirmado() {
		return confirmado;
	}
	public void setConfirmado(boolean confirmado) {
		this.confirmado = confirmado;
	}
	public Blob getFoto() {
		return foto;
	}
	public void setFoto(Blob foto) {
		this.foto = foto;
	}
	@Override
	public String toString() {
		return "Usuarios [email=" + email + ", password=" + password + ", nome=" + nome + ", sobrenome=" + sobrenome
				+ ", cidade=" + cidade + ", uf=" + uf + ", pais=" + pais + ", endereco=" + endereco
				+ ", dataNascimento=" + ", skypeId=" + skypeid + ", telefone=" + telefone
				+ ", confirmado=" + confirmado + ", foto=" + foto + "]";
	}
	
	
	

}
