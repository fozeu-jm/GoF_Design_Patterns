package com.kwd.behavioral.iterator;

public class NameCollection implements Container {
	public String name[] = { "John", "Mary", "Nathalie", "Erica", "Herman" };

	@Override
	public Iterator getIterator() {
		return new CollectionofNamesIterate();
	}

	private class CollectionofNamesIterate implements Iterator {
		int i;

		@Override
		public boolean hasNext() {
			if (i < name.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {
				return name[i++];
			}
			return null;
		}
	}
}
