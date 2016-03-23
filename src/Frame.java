
public class Frame {

		private String name;
		private String type;

		private static int count = 0;
		private int id;

		public Frame(String name, String type) {
			id = count;
			count++;
			this.name = name;
			this.type = type;
		}

		public String showInfo() {
			// System.out.println(id + ": " + name + " " + type); //This is a
			// inefficient way to do this.

			StringBuilder sb = new StringBuilder();
			sb.append(id).append(": ").append(name).append(" - ").append(type);
			return sb.toString();
		}
	}

