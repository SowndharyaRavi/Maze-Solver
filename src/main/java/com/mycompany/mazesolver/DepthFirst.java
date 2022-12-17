/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mazesolver;

import java.util.List;

/**
 *
 * @author sownd
 */
public class DepthFirst {
    public static boolean searchPath(int [][]Maze ,int x,int y,List<Integer>path){
        if(Maze[y][x]==9){
            path.add(x);
            path.add(y);
            return true;
        }
        if(Maze[y][x]==0){
           Maze[y][x]=2;
           
           int dx=-1;
           int dy=0;
           if(searchPath(Maze,x+dx,y+dy,path)){
                path.add(x);
                path.add(y);
                return true;
           }
           dx=1;
           dy=0;
           if(searchPath(Maze,x+dx,y+dy,path)){
                path.add(x);
                path.add(y);
                return true;
           }
           dx=0;
           dy=-1;
           if(searchPath(Maze,x+dx,y+dy,path)){
                path.add(x);
                path.add(y);
                return true;
           }
           dx=0;
           dy=1;
           if(searchPath(Maze,x+dx,y+dy,path)){
                path.add(x);
                path.add(y);
                return true;
           }
        }
        
        return false;
    }
}
