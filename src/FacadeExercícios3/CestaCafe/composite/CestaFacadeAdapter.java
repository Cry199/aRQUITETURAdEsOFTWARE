package FacadeExercícios3.CestaCafe.composite;

public class CestaFacadeAdapter implements Component {
    private CestaFacade cestaFacade;

    public CestaFacadeAdapter(CestaFacade cestaFacade) {
        this.cestaFacade = cestaFacade;
    }

    @Override
    public double getPreco() {
        return cestaFacade.getPrecoTotal();
    }
}
