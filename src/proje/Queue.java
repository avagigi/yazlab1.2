/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proje;
import java.util.ArrayList;

public class Queue {
    ArrayList<Integer>musterisayisi =  new ArrayList<>();
    
    int len; // Kuyruğun boyutu
    int fore; // Dizinin öndeki imleci
    int back; // Dizinin arka imleci
    int dizi[]; // Elemanların eklendiği dizi
    int elemanSayisi;
     
    public Queue(int N){
        this.len = N;
        this.dizi = new int[this.len];
        this.fore = -1;
        this.back = 0;
         
    }
     
    public void put(int nesne){ // Kuyruğa ekleme
        if(!dolumu()){
            this.fore = (this.fore+1)%this.len;
            this.dizi[this.fore] = nesne;
            elemanSayisi++;
        }
        else{
            System.out.println("Kuyruk dolu");
        }
    }
     
    public int pop(){ // Kuyruktan çıkarma
        if(!bosmu()){
            int temp = this.dizi[this.back];
            this.back = (this.back+1)%this.len;
            elemanSayisi--;
            return temp;
             
        }else{
            System.out.println("Kuyruk boş");
            return -1;
        }
    }
     
    public boolean bosmu(){
        if(elemanSayisi == 0){
            return true;
        }else{
            return false;
        }
    }
    
public void musterigeldi(int sayi){
    
    musterisayisi.add(sayi);
}
     
    public boolean dolumu(){
        if(elemanSayisi == this.len){
            return true;
        }else{
            return false;
        }
    }
 /*
    public static void main(String[] args) {
        Queue kuyruk = new Queue(3);
        kuyruk.put(5);
        kuyruk.put(4);
        kuyruk.put(5);
         
        // Bundan sonra eklenecek elemanlar için Kuyruk dolu diyecektir
        kuyruk.put(8);
        System.out.println(kuyruk);
         
         
    }*/
 
}