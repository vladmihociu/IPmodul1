import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Formular {
    private String indrumator;
    private String primaMaterie;
    private String aDouadMaterie;
    private String numeLicenta;
    private String link;
    private String nume;
    private String prenume;
    private String email;
    private String nrMatricol;
    private int zi;
    private int luna;
    private int an;

    public String getIndrumator() {
        return indrumator;
    }

    public void setIndrumator(String indrumator) {
        this.indrumator = indrumator;
    }

    public String getPrimaMaterie() {
        return primaMaterie;
    }

    public void setPrimaMaterie(String primaMaterie) {
        this.primaMaterie = primaMaterie;
    }

    public String getADouadMaterie() {
        return aDouadMaterie;
    }

    public void setADouadMaterie(String aDouadMaterie) {
        this.aDouadMaterie = aDouadMaterie;
    }

    public String getNumeLicenta() {
        return numeLicenta;
    }

    public void setNumeLicenta(String numeLicenta) {
        this.numeLicenta = numeLicenta;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNrMatricol() {
        return nrMatricol;
    }

    public void setNrMatricol(String nrMatricol) {
        this.nrMatricol = nrMatricol;
    }

    public boolean checkEmail(String email) {
        String pattern = "[a-zA-Z0-9]+(['.'_]*[a-zA-Z0-9]+)?@[a-zA-Z]+'.'com";
        String badPattern = "[a-zA-Z0-9]*@info'.'uaic'.'ro";
        Pattern p = Pattern.compile(pattern);
        Pattern bp=Pattern.compile(badPattern);
        Matcher m = p.matcher(nrMatricol);
        Matcher mBP=bp.matcher(nrMatricol);

        if (m.matches() && !mBP.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkNrMatricol(String nrMatricol) {
        String pattern = "[0-9]{8}SL[0-9]{6}";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(nrMatricol);

        if (m.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkName(String name){
        String pattern = "[A-Z][a-z]+";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(nrMatricol);

        if (m.matches()) {
            return true;
        } else {
            return false;
        }
    }

}

