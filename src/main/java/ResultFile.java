public class ResultFile {
    private Double numero;
    private Double quadrado;
    private Double cubo;


    public ResultFile(Double numero, Double quadrado, Double cubo) {
        this.numero = numero;
        this.quadrado = quadrado;
        this.cubo = cubo;
    }


    public Double getNumero() {
        return numero;
    }


    public void setNumero(Double numero) {
        this.numero = numero;
    }


    public Double getQuadrado() {
        return quadrado;
    }


    public void setQuadrado(Double quadrado) {
        this.quadrado = quadrado;
    }


    public Double getCubo() {
        return cubo;
    }


    public void setCubo(Double cubo) {
        this.cubo = cubo;
    }
}
