package injecting.inner.beans;

public class TextEditor {
	SpellChecker spellChecker;

	public SpellChecker getChecker() {
		return spellChecker;
	}

	public void setChecker(SpellChecker checker) {
		this.spellChecker = checker;
	}
}
