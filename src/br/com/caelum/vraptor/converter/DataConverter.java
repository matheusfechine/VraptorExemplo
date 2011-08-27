package br.com.caelum.vraptor.converter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import br.com.caelum.vraptor.Convert;
import br.com.caelum.vraptor.Converter;
import br.com.caelum.vraptor.ioc.RequestScoped;

@Convert(Date.class)
@RequestScoped
public class DataConverter implements Converter<Date>{

	public Date convert(String arg0, Class<? extends Date> arg1,
			ResourceBundle arg2){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			return sdf.parse(arg0);
		} catch (Exception e) {
		}
		return null;
	}

}
