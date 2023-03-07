public class Recursividad {
    
    public int Potencia(int NumB, int NumE){
        int Resultado;
        if(NumB==0){
            Resultado = 0;
        }else{
            if(NumE==0){
                Resultado = 1;
            }else{
                if(NumE!=1){
                    Resultado = NumB * Potencia(NumB, NumE-1);
                }else{
                    Resultado = NumB;
                }
            }
        }
    return Resultado;
    }
}
