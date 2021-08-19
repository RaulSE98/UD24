package app.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="empleados")//en caso que la tabala sea diferente
public class Empleado {

	//Atributos de entidad cliente
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	@Column(name = "puesto")//no hace falta si se llama igual
	private String puesto;
	@Column(name = "salario")
	private int salario;
	
	//Constructores
	
	public Empleado() {
		
	}

	/**
	 * @param id
	 * @param nombre
	 * @param puesto
	 * @param salario
	 */
	public Empleado(String nombre, String puesto) {
		//super();
		
		this.nombre = nombre;
		this.puesto = puesto;
		this.salario = Salario(puesto);
	}
	
	//funcion salario
	public int Salario(String puesto) {
		
		int salario = 0;
		
		switch (puesto) {
			case ("jefe"):
				salario = 10000;
			
			case ("admin"):
				salario = 7000;
			
			case ("currito"):
				salario = 1000;
			
		}
		return salario;
	}

	
	//Getters y Setters
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the puesto
	 */
	public String getPuesto() {
		return puesto;
	}

	/**
	 * @param nombre the puesto to set
	 */
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}



	/**
	 * @return the salario
	 */
	public int getSalario() {
		return salario;
	}

	/**
	 * @param dni the salario to set
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}

	
	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario
				+ "]";
	}
	
	
	
	
	
}
