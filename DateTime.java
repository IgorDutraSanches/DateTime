package com.igordutrasanches.birdsoft.DateTime;
 
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DateTime {
    private static Locale locale = Locale.getDefault();
    
    /**
     *
     * Retorna uma String com a data e hora atual do aparelho
     * @return
     */
    public static String toDateString(){
       SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy HH:mm", locale);
       return date.format(new Date());
    }
     
    /**
     *
    * @param locale = Locale é o local de origem para exibir a data ex: Brasil entre outros, para Brasil use (new Locale("pt", "BR")
     * @return
     */
    public static String toDateString(Locale locale){
       SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy HH:mm", locale);
       return date.format(new Date());
    }
     
    /**
     *
     * @param format = String onde você coloca o formato da data ex: dd/MM/yyyy
     * @return
     */
    public static String toDateString(String format){
       SimpleDateFormat date = new SimpleDateFormat(format, locale);
       return date.format(new Date());
    }
    
    /**
     *
     * @param format = String onde você coloca o formato da data ex: dd/MM/yyyy
     * @param locale = Locale é o local de origem para exibir a data ex: Brasil entre outros, para Brasil use (new Locale("pt", "BR")
     * @return
     */
    public static String toDateString(String format, Locale locale){
       SimpleDateFormat date = new SimpleDateFormat(format, locale);
       return date.format(new Date());
    }
     
    /**
     *
     * @param format = String onde você coloca o formato da data ex: dd/MM/yyyy
     * @param time = String da data que deseja adicionar ex: 05/10/1997
     * @param locale = Locale é o local de origem para exibir a data ex: Brasil entre outros, para Brasil use (new Locale("pt", "BR")
     * @return
     */
    public static String toDateString(String format, long time, Locale locale){
       SimpleDateFormat date = new SimpleDateFormat(format, locale);
       return date.format(time);
    }
     
    /**
     *
     * @param format = String onde você coloca o formato da data ex: dd/MM/yyyy
    * @param time = Adicione o time que deseja para retorna a String com o formado desejado
     * @return
     */
    public static String toDateString(String format, long time){
       SimpleDateFormat date = new SimpleDateFormat(format, locale);
       return date.format(time);
    }
     
   /**
     *
      * @param time = Adicione o time que deseja para retorna a String com o formado desejado
    * @param locale = Locale é o local de origem para exibir a data ex: Brasil entre outros, para Brasil use (new Locale("pt", "BR")
     * @return
     */
     public static String toDateString(long time, Locale locale){
       SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy HH:mm", locale);
       return date.format(time);
    }
    
     /**
     *
    * @param time = Adicione o time que deseja para retorna a String com o formado desejado
     * @return
     */
    public static String toDateString(long time){
       SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy HH:mm", locale);
       return date.format(time);
    }
      
     /**
     *
     * Pegue o time da data e hora atual no formato dd/MM/yyyy HH:mm
     * @return
     */
    public static long getTime(){
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy HH:mm", locale);
        try {
            return date.parse(date.format(new Date())).getTime();
        } catch (ParseException ex) {
            Logger.getLogger(DateTime.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
      
    /**
     *
     * @param format = String onde você coloca o formato da data ex: dd/MM/yyyy
     * @return
     */
     public static long getTime(String format){
        SimpleDateFormat date = new SimpleDateFormat(format, locale);
        try {
            return date.parse(date.format(new Date())).getTime();
        } catch (ParseException ex) {
            Logger.getLogger(DateTime.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
       
     /**
     *
     * @param format = String onde você coloca o formato da data ex: dd/MM/yyyy
     * @param locale = Locale é o local de origem para exibir a data ex: Brasil entre outros, para Brasil use (new Locale("pt", "BR")
     * @return
     */
    public static long getTime(String format, Locale locale){
        SimpleDateFormat date = new SimpleDateFormat(format, locale);
        try {
            return date.parse(date.format(new Date())).getTime();
        } catch (ParseException ex) {
            Logger.getLogger(DateTime.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
      
    /**
     *
     * @param locale = Locale é o local de origem para exibir a data ex: Brasil entre outros, para Brasil use (new Locale("pt", "BR")
     * @return
     */
    public static long getTime(Locale locale){
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy HH:mm", locale);
        try {
            return date.parse(date.format(new Date())).getTime();
        } catch (ParseException ex) {
            Logger.getLogger(DateTime.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
   /**
     *
     * @param format = String onde você coloca o formato da data ex: dd/MM/yyyy
     * @param data = String da data que deseja adicionar ex: 05/10/1997
     * @return
     */
     public static long getTime(String format, String data){
        SimpleDateFormat date = new SimpleDateFormat(format, locale);
        try {
            return date.parse(data).getTime(); 
        } catch (ParseException ex) {
            Logger.getLogger(DateTime.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    /**
     *
     * @param format = String onde você coloca o formato da data ex: dd/MM/yyyy
     * @param data = String da data que deseja adicionar ex: 05/10/1997
     * @param locale = Locale é o local de origem para exibir a data ex: Brasil entre outros, para Brasil use (new Locale("pt", "BR")
     * @return
     */
    public static long getTime(String format, String data, Locale locale){
        SimpleDateFormat date = new SimpleDateFormat(format, locale);
        try {
            return date.parse(data).getTime(); 
        } catch (ParseException ex) {
            Logger.getLogger(DateTime.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
}
