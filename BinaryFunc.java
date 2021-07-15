package userfuncs.binaryfuncs;

public interface BinaryFunc{
    // Obtiene el nombre de la función.
    public String getNombre();

    // Esta es la función a realizar. 
    // Será provista por implementaciones específicas.
    public int func(int a, int b);
}