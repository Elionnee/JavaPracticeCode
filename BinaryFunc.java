package userfuncs.binaryfuncs;

public interface BinaryFunc{
    // Obtiene el nombre de la funci�n.
    public String getNombre();

    // Esta es la funci�n a realizar. 
    // Ser� provista por implementaciones espec�ficas.
    public int func(int a, int b);
}