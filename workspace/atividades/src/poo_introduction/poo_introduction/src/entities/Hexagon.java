package entities;
/* Classe(tipo) que ira dar origem a isntancias em outro arquivo
 * podendo ser reaproveitada.
 * Essa classe possui de forma publica o atributo "l" que e referente
 * ao lado do hexagono e o metodo "area()" que calcula a area do mesmo
 */
public class Hexagon {

	public double l;
	
	public double area() {
		return (3 * Math.pow(l, 2) * Math.cbrt(3)) / 2;
	}

}