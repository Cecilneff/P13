package p3;
import java.io.Serializable;

public class UserTemporales implements Serializable {
String name;
String ape;
String dni;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getApe() {
	return ape;
}
public void setApe(String ape) {
	this.ape = ape;
}
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}
public UserTemporales(String name, String ape, String dni) {
	super();
	this.name = name;
	this.ape = ape;
	this.dni = dni;
}

public UserTemporales() {}
}

