package validacao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class Valid {
        private String regex;

        public String getDateRegexFormat() {
                regex = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|"
                                + "[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|"
                                + "(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|"
                                + "(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

                return regex;
        }
        
        public void tempoExcecucaoFormatado(long tempoIni, long tempoFinal) {
            long tempoExcec = tempoFinal - tempoIni; 
            String tempoStr = Long.toString(tempoExcec);
            System.out.println(tempoStr+"ms");
        }

        public java.sql.Date getSqlDateNasci(java.util.Date data){
                try{
                        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                        String dataFormatada = df.format(data);
                        
                        java.util.Date utilDate = new SimpleDateFormat("dd/MM/yyyy").parse(dataFormatada);
                        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

                        return sqlDate;
                }catch(Exception e){
                       e.printStackTrace();
                       return null; 
                }
        }
}