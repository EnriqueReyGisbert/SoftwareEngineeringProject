package tp.p1.characters;

public interface IAttack {
	
	default boolean performAttack(GameObject other) {return false;}
	default boolean receiveMissileAttack(int damage) {return false;};
	default boolean receiveBombAttack(int damage) {return false;};
	default boolean receiveShockWaveAttack(int damage) {return false;};

}