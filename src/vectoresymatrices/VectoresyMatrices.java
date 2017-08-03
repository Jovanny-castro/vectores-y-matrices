/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresymatrices;

import javax.swing.JOptionPane;

/**
 *
 * @author 312A-12
 */
public class VectoresyMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int R=Integer.parseInt
        (JOptionPane.showInputDialog("Ingrese 1, 2, 3 o 4 según el ejercicio que desea visualizar"));
        
        switch (R){
            case 1:
            {
                int suma=0;
                int media;
                int tamanho=Integer.parseInt
                (JOptionPane.showInputDialog("Cuantos valores desea ingresar?"));
                int vec[]=new int[tamanho];
                int k=0;
                
                vec[k]=Integer.parseInt
                (JOptionPane.showInputDialog("Ingrese un valor"));
                suma=suma+vec[k];

                while (vec[k]!=0 && k<tamanho-1)
                {
                    
                    k++;
                    vec[k]=Integer.parseInt
                    (JOptionPane.showInputDialog("Ingrese un valor"));
                    suma=suma+vec[k];
                }
                media=suma/k;
                for(int i=0;i<=k;i++)
                {
                    if(vec[i]>media)
                    {
                        System.out.println("El valor: "+vec[i]+", esta por encima de la media");
                    }
                }
            }
            break;
            case 2:
            {
                int vec[]=new int[10];
                int par=0;
                int mayor;
                int menor;
                
                vec[0]=Integer.parseInt
                (JOptionPane.showInputDialog("Ingrese un valor"));
                mayor=vec[0];
                menor=vec[0];
                for(int i=1;i<vec.length;i++)
                {
                    vec[i]=Integer.parseInt
                    (JOptionPane.showInputDialog("Ingrese un valor"));
                    if(vec[i]%2==0)
                    {
                        par++;
                    }
                    if(vec[i]>mayor)
                    {
                        mayor=vec[i];
                    }
                    if(vec[i]<menor)
                    {
                        menor=vec[i];
                    }
                }
                int numero1=Integer.parseInt
                    (JOptionPane.showInputDialog("Ingrese un valor a buscar"));
                int numero2=Integer.parseInt
                    (JOptionPane.showInputDialog("Ingrese un valor a buscar"));
                for(int i=1;i<vec.length;i++)
                {
                    
                    if(numero1==vec[i])
                    {
                        System.out.println("El número: "+numero1+", esta entre los numeros del vector");
                    }
                    
                    if(numero2==vec[i])
                    {
                        System.out.println("El número: "+numero2+", esta entre los numeros del vector");
                    }
                }
                System.out.println("El número de pares en el vector es: "+par+", el mayor es: "+mayor+", el menor es: "+menor);   
            }
            break;
            case 3:
            {
                int mat[][]=new int [4][3];
                int sumapos=0;
                int sumaneg=0;
                int mayor=0;
                int menor=9999;
                int k=0;
                int l=0;
                int m=0;
                int n=0;
                
                for(int i=0;i<4;i++)
                {
                    for(int j=0;j<3;j++)
                    {
                        mat[i][j]=Integer.parseInt
                        (JOptionPane.showInputDialog("Ingrese un valor"));
                        if(mat[i][j]>0)
                        {
                            sumapos=sumapos+mat[i][j];
                        }
                        else if(mat[i][j]<0)
                        {
                            sumaneg=sumaneg+mat[i][j];
                        }
                        if (mat[i][j]>mayor)
                        {
                            mayor=mat[i][j];
                            k=i;
                            l=j;
                        }
                        if (mat[i][j]<menor)
                        {
                            menor=mat[j][i];
                            m=i;
                            n=j;
                        }
                    }
                }
                System.out.println("La suma de los positivos es: "+
                        sumapos+", la suma de los negativos es: "+sumaneg+
                        ", el mayor es: "+mayor+" y esta en la posicion: "
                        +k+", "+l+" , el menor es: "+menor+" y esta en la posicion: "
                        +m+", "+n);
            }
            break;
            case 4:
            {
                int matr[][]=new int [2][2];
                int vect[]=new int[4];
                for(int i=0;i<2;i++)
                {
                    for(int j=0;j<2;j++)
                    {
                        matr[i][j]=Integer.parseInt
                        (JOptionPane.showInputDialog("Ingrese un valor"));
                        
                    }
                }
                System.out.println("La matriz ingresada es:");
                for (int i=0; i < matr.length; i++) 
                {
                    System.out.print("|");
                    for (int j=0; j < matr[i].length; j++) 
                    {
                        System.out.print (matr[i][j]);
                        if (j!=matr[i].length-1) System.out.print("\t");
                    }
                    System.out.println("|");
                }
                int filai=Integer.parseInt
                (JOptionPane.showInputDialog("Ingrese la fila I a intercambiar con la fila J"));
                int filaj=Integer.parseInt
                (JOptionPane.showInputDialog("Ingrese la fila J a intercambiar con la fila I"));
                for(int i=0;i<4;i++)
                {
                    for(int j=0;j<4;j++)
                    {
                        if(i==filai)
                        {
                            vect[j]=matr[filai][j];
                            matr[filaj][j]=matr[filai][j];
                        }  
                    }
                }
                for(int i=0;i<4;i++)
                {
                    for(int j=0;j<3;j++)
                    {
                        if(i==filaj)
                        {
                            matr[i][j]=vect[j];
                        }  
                    }
                }
                System.out.println("La matriz ingresada con el cambio es:");
                for (int j=0; j < matr.length; j++) 
                {
                    System.out.print("|");
                    for (int i=0; i < matr[j].length; i++) 
                    {
                    System.out.print (matr[i][j]);
                    if (i!=matr[j].length-1) System.out.print("\t");
                    }
                    System.out.println("|");
                }
            }
            break;
        }
                
    }
    
}
