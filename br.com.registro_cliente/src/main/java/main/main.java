package main;

import java.util.Calendar;
import java.util.Date;

import DAO.Conn_bd;
import VO.ClienteVO;
import validacao.Valid;;

public class main {
    public static void main(String args[]){
        long tempoIni = System.currentTimeMillis();
        //Instanciações
        Conn_bd conn = new Conn_bd();
        Valid valid = new Valid();
        ClienteVO vo = new ClienteVO();
        
        long tempoFinal = System.currentTimeMillis();
        valid.tempoExcecucaoFormatado(tempoIni, tempoFinal);
    }
}