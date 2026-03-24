package model;

public class Visitante 
{
    private int nombre;
    private int Tipo;
    private int Text;
    private int SelectionModel;


    public int getSelectionModel() {
        return SelectionModel;
    }

    public void setSelectionModel(int selectionModel) {
        SelectionModel = selectionModel;
    }

    public Visitante(int nombre, int tipo, int Text, int SelectionModel) 
    {
        this.nombre = nombre;
        this.Tipo = tipo;
        this.Text = Text;
        
    }

    public int getNombre() 
    {
        return nombre;
    }

    public void setNombre(int nombre) 
    {
        this.nombre = nombre;
    }

    public int getTipo() 
    {
        return Tipo;
    }

    public void setTipo(int tipo) 
    {
        Tipo = tipo;
    }

    public void setText(int Text)
    {
        Text = Text;

    }
    public int getText()
    {
        return Text;
    }


    


    public static void remove(Visitante seleccionado) {
       
        throw new UnsupportedOperationException(" 'removido'");
    }

   


    
    


    
    


}
