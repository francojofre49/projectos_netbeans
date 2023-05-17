
package entidad;


public class Curso {
    
    private String nombrecurso;
    private int hspordia;
    private int diasporsemana;
    private String turno;
    private double precioporhora;
    private String[] alumnos = new String[5];

    public Curso() {
    }

    public Curso(String nombrecurso, int hspordia, int diasporsemana, String turno, double precioporhora) {
        this.nombrecurso = nombrecurso;
        this.hspordia = hspordia;
        this.diasporsemana = diasporsemana;
        this.turno = turno;
        this.precioporhora = precioporhora;
    }

    public String getNombrecurso() {
        return nombrecurso;
    }

    public void setNombrecurso(String nombrecurso) {
        this.nombrecurso = nombrecurso;
    }

    public int getHspordia() {
        return hspordia;
    }

    public void setHspordia(int hspordia) {
        this.hspordia = hspordia;
    }

    public int getDiasporsemana() {
        return diasporsemana;
    }

    public void setDiasporsemana(int diasporsemana) {
        this.diasporsemana = diasporsemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioporhora() {
        return precioporhora;
    }

    public void setPrecioporhora(double precioporhora) {
        this.precioporhora = precioporhora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
    
    
    
    
}
