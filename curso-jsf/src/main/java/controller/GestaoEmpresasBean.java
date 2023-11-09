package controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import model.Empresa;
import model.TipoEmpresa;

@Named
@ViewScoped
public class GestaoEmpresasBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Empresa empresa = new Empresa();
	
	public void salvar() {
		System.out.println("Razao social: " + empresa.getRazaoSocial() + 
	" - Nome fanasia: " + empresa.getNomeFantasia() + 
	" - Tipo: " + empresa.getTipo());
	}
	
	public String ajuda() {
		return "AjudaGestaoEmpresas?faces-redirect=true";
	}
	
	public Empresa getEmpresa() {
		return empresa;
	}
	
	public TipoEmpresa[] getTiposEmpresa() {
		return TipoEmpresa.values();
	}
	
}
