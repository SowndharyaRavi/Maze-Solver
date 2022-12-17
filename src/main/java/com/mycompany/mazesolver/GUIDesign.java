/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mazesolver;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author sownd
 */
public class GUIDesign extends JFrame{
    int [][]Maze={
        {1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,0,1,0,1,0,1,0,0,0,0,0,1},
        {1,0,1,0,0,0,1,0,1,1,1,0,1},
        {1,0,1,1,1,1,1,0,0,0,0,0,1},
        {1,0,1,0,0,0,0,0,1,1,1,0,1},
        {1,0,1,0,1,1,1,0,0,0,0,0,1},
        {1,0,1,0,1,0,0,0,1,1,1,0,1},
        {1,0,1,0,1,1,1,0,1,0,1,0,1},
        {1,0,0,0,0,0,0,0,0,0,1,9,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1},
        
    };
    public List<Integer>path=new ArrayList<>();
    GUIDesign(){
        setTitle("Maze Solver");
        setSize(640,480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DepthFirst.searchPath(Maze,1,1,path);
        System.out.println(path);
        
    }
    @Override
    public void paint(Graphics g){
        g.translate(50, 50);//centralize the box
        super.paint(g);
        for(int i=0;i<Maze.length;i++){
            for(int j=0;j<Maze[0].length;j++){
                Color color;
                switch(Maze[i][j]){
                    case 1:color=Color.BLACK;
                    break;
                    case 9:color=Color.RED;
                    break;
                    default:color=Color.WHITE;
                    break;
                }
                g.setColor(color);
                g.fillRect(30*j, 30*i, 30, 30);//fill the rect with colors
                g.setColor(Color.RED);//border or outline of rect.
                g.drawRect(30*j, 30*i, 30, 30);//to draw the outline of the rect
            }
        }
        for(int i=0;i<path.size();i+=2){
            int pathx=path.get(i);
            int pathy=path.get(i+1);
            g.setColor(Color.GREEN);
            g.fillRect(30*pathx,30*pathy,30,30);
        }
    }
    public static void main(String[] args){
        GUIDesign design=new GUIDesign();
        design.setVisible(true);
    }
}
