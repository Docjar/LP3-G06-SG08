package com.mycompany.e2lab3;
import java.util.Scanner;
import java.util.Calendar;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(){
        this.dia = 1;
        this.mes = 1;
        this.anio = 1900;
    }
    
    public Fecha(int dia,int mes,int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        valida();
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public void leer(){
        Scanner sc = new Scanner(System.in);
        int d = 32;
        int m = 13;
        int a = 2051;
        boolean bis;
        while(d<1 || d>31 || m<1 || m>12 || a<1900 || a>2050)
        {
            System.out.println("Ingrese el dia (1 a 31) ");
            d = sc.nextInt();
            setDia(d);
            System.out.println("Ingrese el mes (1 a 12) ");
            m = sc.nextInt();
            setMes(m);
            System.out.println("Ingrese el anio (1900 a 2050) ");
            a = sc.nextInt();
            setAnio(a);
            valida();
            
        }
    }
    
    public boolean bisiesto(){
        return (anio%4 == 0 && anio%100 != 0 || anio % 400 == 0);

    }
    public int diasMes(int mes) {
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (mes == 2 && bisiesto()) {
            return 29;
        }
        return diasPorMes[mes];
    }
    
    private void valida(){
        if (anio < 1900 || anio > 2050) {
            anio = 1900;
        }
        if (mes < 1 || mes > 12) {
            mes = 1;
        }
        int maxDias = diasMes(mes);
        if (dia < 1 || dia > maxDias) {
            dia = 1;
        }
    }
     public void corta() {
        System.out.printf("%02d-%02d-%04d%n", dia, mes, anio);
    }
     public int diasTranscurridos() {
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        int dias = dia;
        for (int i = 1; i < mes; i++) {
            dias += diasPorMes[i];
        }
        if (mes > 2 && bisiesto()) {
            dias++;
        }
        for (int i = 1900; i < anio; i++) {
            dias += (bisiesto() ? 366 : 365);
        }
        return dias - 1;
    }
    // Método para calcular el día de la semana
    public int diaSemana() {
        int m = (mes <= 2) ? mes + 12 : mes;
        int D = dia;
        int Y = (mes <= 2) ? (anio - 1) : anio;

        int K = Y % 100;
        int J = Y / 100;

        int h = (D + (13 * (m + 1)) / 5 + K + (K / 4) + (J / 4) - 2 * J) % 7;

        // Ajustar el resultado para que sea 0 para domingo, 1 para lunes, etc.
        return (h + 5) % 7;
    }

    public void larga() {
        String[] nombresDias = {"Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};
        String[] nombresMeses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String nombreDiaSemana = nombresDias[diaSemana()];
        String nombreMes = nombresMeses[mes - 1];
        System.out.printf("%s %d de %s de %d%n", nombreDiaSemana, dia, nombreMes, anio);
    }

    public void fechaTras(long dias) {
        Calendar calendario = Calendar.getInstance();
        calendario.set(anio, mes - 1, dia);
        calendario.add(Calendar.DAY_OF_YEAR, (int) dias);
        this.dia = calendario.get(Calendar.DAY_OF_MONTH);
        this.mes = calendario.get(Calendar.MONTH) + 1;
        this.anio = calendario.get(Calendar.YEAR);
        valida();
    }

    public int diasEntre(Fecha otraFecha) {
        Calendar fecha1 = Calendar.getInstance();
        fecha1.set(anio, mes - 1, dia);
        Calendar fecha2 = Calendar.getInstance();
        fecha2.set(otraFecha.anio, otraFecha.mes - 1, otraFecha.dia);

        long diferencia = (fecha2.getTimeInMillis() - fecha1.getTimeInMillis()) / (1000 * 60 * 60 * 24);
        return (int) diferencia;
    }

    public void siguiente() {
        Calendar calendario = Calendar.getInstance();
        calendario.set(anio, mes - 1, dia);
        calendario.add(Calendar.DAY_OF_YEAR, 1);
        this.dia = calendario.get(Calendar.DAY_OF_MONTH);
        this.mes = calendario.get(Calendar.MONTH) + 1;
        this.anio = calendario.get(Calendar.YEAR);
        valida();
    }

    public void anterior() {
        Calendar calendario = Calendar.getInstance();
        calendario.set(anio, mes - 1, dia);
        calendario.add(Calendar.DAY_OF_YEAR, -1);
        this.dia = calendario.get(Calendar.DAY_OF_MONTH);
        this.mes = calendario.get(Calendar.MONTH) + 1;
        this.anio = calendario.get(Calendar.YEAR);
        valida();
    }

    public void fechaFutura(long dias) {
        Calendar calendario = Calendar.getInstance();
        calendario.set(anio, mes - 1, dia);
        calendario.add(Calendar.DAY_OF_YEAR, (int) dias);
        this.dia = calendario.get(Calendar.DAY_OF_MONTH);
        this.mes = calendario.get(Calendar.MONTH) + 1;
        this.anio = calendario.get(Calendar.YEAR);
        valida();
    }

    public Fecha copia() {
        return new Fecha(this.dia, this.mes, this.anio);
    }

    public static boolean igualQue(Fecha fecha1, Fecha fecha2) {
        return (fecha1.dia == fecha2.dia && fecha1.mes == fecha2.mes && fecha1.anio == fecha2.anio);
    }

    public static boolean menorQue(Fecha fecha1, Fecha fecha2) {
        if (fecha1.anio < fecha2.anio) {
            return true;
        } else if (fecha1.anio == fecha2.anio && fecha1.mes < fecha2.mes) {
            return true;
        } else if (fecha1.anio == fecha2.anio && fecha1.mes == fecha2.mes && fecha1.dia < fecha2.dia) {
            return true;
        }
        return false;
    }

    public static boolean mayorQue(Fecha fecha1, Fecha fecha2) {
        if (fecha1.anio > fecha2.anio) {
            return true;
        } else if (fecha1.anio == fecha2.anio && fecha1.mes > fecha2.mes) {
            return true;
        } else if (fecha1.anio == fecha2.anio && fecha1.mes == fecha2.mes && fecha1.dia > fecha2.dia) {
            return true;
        }
        return false;
    }
}
