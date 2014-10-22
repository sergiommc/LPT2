import java.util.ArrayList;
import javax.swing.JOptionPane;
 
public class Empresa {
    private ArrayList <Funcionario> listadeFuncinarios = new ArrayList <Funcionario>();
     
     
    public static void main (String args[]){
    Empresa empre = new Empresa();
         
        int op=0;
         
        while (op != 5){
            //Escolher a opзгo desejada
             
            op = Integer.parseInt(JOptionPane.showInputDialog("Empresa X\n\nDigite a opзгo desejada:\n 1-Para cadastrar \n 2-Para localizar \n 3-Remover \n 4-Listar Funcionarios \n 5-Sair "));
             
            //cadastrar
             
            if (op == 1){
                String nome = JOptionPane.showInputDialog("Digite seu nome:");
                int matricula= Integer.parseInt(JOptionPane.showInputDialog("Digite sua matrнcula:"));      
                empre.adicionarFuncionario(nome,matricula);
            }//localizar
             
            if (op == 2){
                int matricula= Integer.parseInt(JOptionPane.showInputDialog("Qual sua matrнcula para procurar?"));
                JOptionPane.showMessageDialog(null, empre.getLocalizarFuncionario(matricula));
            }//remover
             
            if (op == 3){
                int matricula= Integer.parseInt(JOptionPane.showInputDialog("Qual a matrнcula para remover?"));
                JOptionPane.showMessageDialog(null,empre.getRemoverFuncionario(matricula));
            }//listar funcionбrios
             
             if (op == 4){
                empre.setExibirFuncionario();
                 
            }
        }
             
    }
     
    //mйtodo para adiзгo de funcionбrios
    public void adicionarFuncionario(String nome,int matricula){
        Funcionario funcio = new Funcionario();
        funcio.setNome(nome);
        funcio.setMatricula(matricula);
        this.listadeFuncinarios.add(funcio);
         
    }
 
    //mйtodo para localizaзгo de funcionбrios
    public String getLocalizarFuncionario (int matricula){
        //se estiver vazia
        if (this.listadeFuncinarios.isEmpty()){
            return "Lista vazia";
        }
        //senгo, procurar funcionario
        else {          
            for (int i=0; i < this.listadeFuncinarios.size();i++){               
                Funcionario funcio = (Funcionario) this.listadeFuncinarios.get(i);
                int mat = funcio.getMatricula();
                 
                //se encontrar mostre
                if (matricula == mat){                  
                    return "Funcionario Localizado: "+funcio.getNome();
                }           
            }   
            //retorne se nгo encontrar
            return "Funcionario nгo localizado";            
        }   
    }
 
    //mйtodo para remoзгo de funcionбrios
    public String getRemoverFuncionario(int matricula){
         
        //se estiver vazia
        if (this.listadeFuncinarios.isEmpty()){
            return "lista vazia";
        }
        //senгo, procure
        else {
            for (int i=0; i < this.listadeFuncinarios.size();i++){               
                Funcionario funcio = (Funcionario) this.listadeFuncinarios.get(i);
                int mat = funcio.getMatricula();
                if (matricula == mat){
                    this.listadeFuncinarios.remove(i);
                    return "Funcionario Removido: "+funcio.getNome();                   
                }           
            }
            //se nгo encontrar
            return "Funcionбrio nгo pode ser localizado";
        }               
    }
 
    //mйtodo para mostrar de funcionбrios
    public void setExibirFuncionario(){     
        //se estiver vazia
        if (this.listadeFuncinarios.isEmpty()){
            JOptionPane.showMessageDialog(null, "Lista vazia");
        }
         
        //senгo mostrar todos
        else {
            String mostrartodos="";
             
            for (int i=0;i<this.listadeFuncinarios.size();i++){
                Funcionario funcio = (Funcionario) this.listadeFuncinarios.get(i);
             
                mostrartodos+="Nome:"+funcio.getNome() + " "+ "Matricula: "+funcio.getMatricula()+"\n"; 
            }
            //mostrar todos os da lista
            JOptionPane.showMessageDialog(null,mostrartodos);           
        }
    }
     
     
}
