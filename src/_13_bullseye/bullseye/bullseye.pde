void setup(){
       size(600,600);
       background(#000000);
       for(int i=0; i<13; i++){
         if(i%2==0){
         fill(#FF0303);
         }else {
          fill(#FFFFFF); 
         }
ellipse(300,300,350-i*30,350-i*30);

       }
    }

    void draw(){


    }