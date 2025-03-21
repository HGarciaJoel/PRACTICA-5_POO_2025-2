package POOP5;

/**
 * @author GHormigaJoel
 */

class Circulo {

    /**
     * Atributos:
     * PI -> relacion tentre el diametro y radio
     * radio -> medida desde el centro del circulo hasta un punto en el perimetro de este mismo
     */
    float PI = (float)Math.PI;
    private float radio;

    /**
     * radio -> medida desde el centro del circulo hasta un punto en el perimetro de este mismo
     * @param radio este no puede ser negativo
     */
    public Circulo(float radio){
        if(radio<0){
            this.radio = Math.abs(radio) ;
            return;
        }
        this.radio = radio;
    }

    /**
     * Obtiene el radio del Circulo
     * @return numero flotante de distancia
     */

    public float getRadio() {
        return radio;
    }

    /**
     * Establece el radio del circulo
     * @param radio numero flotante no menor a 0
     */

    public void setRadio(float radio) {
        if(radio<0){
            this.radio = Math.abs(radio);
            return;
        }
        this.radio = radio;
    }

    /**
     * calcula el area del ciruculo, para esto se necesita que el atributo radio tenga un valor
     * @return flotante [unidad]^{2}
     */

    float calcularArea(){
        return (float)(PI*Math.pow(radio,2));
    }

    /**
     * calcula el perimetro del circulo en base al radio
     * @return numero flotante [unidad]
     */

    float calcularPerimetro(){
        return (float)(2*PI*radio);
    }


}
