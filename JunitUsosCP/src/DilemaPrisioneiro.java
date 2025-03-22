
public class DilemaPrisioneiro {
	private int PENA_INOCENCIA = 0;
	private int PENA_CONDENACAO_MUTUA = 5;
	private int PENA_CONDENACAO_INDIVIDUAL = 10;
	private int PENA_CONDENACAO_CUMPLICES = 1;
	

	public int calculaPena(Resposta prisioneiroA, Resposta prisioneiroB) {
		if(prisioneiroA == Resposta.DELACAO) {
			if(prisioneiroB == Resposta.DELACAO) {
				return PENA_CONDENACAO_MUTUA;
			}else {
				return PENA_INOCENCIA;
			}
		}else {
			if(prisioneiroB == Resposta.DELACAO) {
				return PENA_CONDENACAO_INDIVIDUAL;
			}else {
				return PENA_CONDENACAO_CUMPLICES;
			}
		}
	}
}
