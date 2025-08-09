/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.aluno.irrm.playerchaotic;

import io.github.guisso.jankenpon.AbstractPlayer;
import io.github.guisso.jankenpon.Move;
/**
 *
 * @author iagor
 */

// <outputDirectory>C:\\dev\\projects\\javase\\JanKenPonManager\\players</outputDirectory> foi alterado para:
// <outputDirectory>C:\\Users\\iagor\\Documents\\NetBeansProjects\\JanKenPonManager\\players</outputDirectory>
public class PlayerChaotic extends AbstractPlayer{
    
    @Override
    public String getDeveloperName(){
        return "Iago R.R. Maia";
    }

    @Override
    public Move makeMyMove(Move opponentPreviousMove) {
        double numAleatorio = (int)(Math.random()*10);
        if(opponentPreviousMove == null){
            return Move.NONE;
        }else{
            if(numAleatorio < 3 ) return Move.PAPER;
            else if (numAleatorio < 7) return Move.ROCK;
            else return Move.SCISSORS; 
//            
//            return switch (opponentPreviousMove) {
//                case Move.ROCK -> Move.PAPER;
//                case Move.PAPER -> Move.SCISSORS;
//                case Move.SCISSORS -> Move.ROCK;
//                    // default devera ser rock 
//                default -> Move.PAPER; };
            
        }
    }
    
}
