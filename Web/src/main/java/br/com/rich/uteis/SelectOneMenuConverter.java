package br.com.rich.uteis;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import javax.faces.convert.Converter;

import br.com.rich.model.EstadoModel;
import br.com.rich.repository.EstadoRepository;

@FacesConverter(value = "selectOneMenuConverter", forClass = EstadoRepository.class)
public class SelectOneMenuConverter implements Converter, Serializable {

	//EstadoRepository estadoRepository = new EstadoRepository();
	
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	    public Object getAsObject(FacesContext fc, UIComponent uic, String codigo) {
		  if(codigo != null && !codigo.isEmpty()) {
	        	try {
	        		EstadoRepository estadoRepository = (EstadoRepository) fc.getExternalContext().getApplicationMap().get("estadoRepository");
	                return estadoRepository.ConsultarEstado(Integer.parseInt(codigo));
	            } catch(NumberFormatException e) {
	                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "N�o � um estado valido"));
	            }
	        }
	        else {
	            return null;
	        }
	    }

	  public String getAsString(FacesContext fc, UIComponent uic, Object object) {
	        if(object != null) {
	            return String.valueOf(((EstadoModel) object).getId());
	        }
	        else {
	            return null;
	        }
	    }   
	
}





  

