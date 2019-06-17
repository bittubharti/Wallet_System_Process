import java.util.*;

class Wallet {
	TreeMap<String, TreeMap<String, String>> tmap;
	TreeMap<String, TreeMap<String, LinkedList>> transaction_payee;
	TreeMap<String, TreeMap<String, LinkedList>> transaction_payer;
	TreeSet<String> cardset;

	Wallet() {
		cardset = new TreeSet<String>();
		transaction_payee = new TreeMap();
		transaction_payer = new TreeMap();
	}

	void menu() {
		do {
			System.out.println("--------------Menu--------------");
			System.out.println("user <user name>");
			System.out.println("add  <user> <card_number>");
			System.out.println("pay  <actor> <target> <amount> <note>");
			System.out.println("feed <user name>");
			System.out.println("balance <user name>");
			System.out.println("To Exit <exit>");
			String str[] = (new Scanner(System.in)).nextLine().split(" ");

			switch (str[0]) {

			case "user":
				if (str.length == 2)
					createUser(str[1]);
				else
					System.out.println("Invalid Argument");
				break;

			case "balance":
				if (str.length == 2)
					balanceUser(str[1]);
				else
					System.out.println("Invalid Argument");
				break;

			case "add":
				if (str.length < 3)
					System.out.println("Invalid Argument");
				else if (tmap == null)
					System.out.println("Invalid User");
				else {
					try {
						Long.parseLong(str[2].trim());
						add(str[1], str[2]);
					} catch (Exception e) {
						System.out.println("Card Number cannot be aplhanumeric");
					}

				}
				break;

			case "pay":
				if (str.length < 5)
					System.out.println("Invalid Argument");
				else {
					try {
						Long.parseLong(str[3]);
						StringBuffer sbfr = new StringBuffer();
						int i;
						for (i = 4; i < str.length; i++)
							sbfr.append(str[i] + " ");

						pay(str[1], str[2], str[3], new String(sbfr));
						System.out.println("Enter");
					} catch (Exception e) {
						System.out.println("Amount cannot be alphanumeric");
					}
				}

				break;

			case "feed":
				if (str.length == 2)
					feed(str[1]);
				else
					System.out.println("Invalid Argument");

				break;

			case "exit":
				System.exit(0);

			default:
				System.out.println("Command not recognized");

			}

		} while (true);

	}

	void pay(String payer, String payee, String amount, String note) {

		if (tmap.containsKey(payer) == false)
			System.out.println("Invalid Payer");

		else if (tmap.containsKey(payee) == false)
			System.out.println("Invalid Payee");

		else if (payer.equals(payee))
			System.out.println("Payer and Payee cannot be same");

		else if (tmap.get(payer).get("card_no") == null)
			System.out.println("Payer does not have card number");

		else {
			if (transaction_payee.containsKey(payee)) {

				if (transaction_payee.get(payee).containsKey(payer)) {
					LinkedList<String> list = transaction_payee.get(payee).get(payer);
					list.add("paid " + amount + " " + note);
					transaction_payee.get(payee).put(payer, list);

				} else {
					LinkedList<String> list = new LinkedList();
					list.add("paid " + amount + " " + note);
					transaction_payee.get(payee).put(payer, list);
				}
			}

			else {
				TreeMap<String, LinkedList> tmp = new TreeMap();
				LinkedList<String> list = new LinkedList();
				list.add("paid " + amount + " " + note);
				tmp.put(payer, list);
				transaction_payee.put(payee, tmp);
			}
//Transaction Payer

			if (transaction_payer.containsKey(payer)) {
				if (transaction_payer.get(payer).containsKey(payee)) {
//System.out.println("Payee found");
					LinkedList<String> list = transaction_payer.get(payer).get(payee);
					list.add("paid " + amount + " " + note);
					transaction_payer.get(payer).put(payee, list);
//transaction_payee.get(payee).get(payer).add("paid " + amount + " " + note);
				}

//transaction_payee.get(payer).get(payee).add("paid " + amount + " " + note);
				else {
					LinkedList<String> list = new LinkedList();
					list.add("paid " + amount + " " + note);
					transaction_payer.get(payer).put(payee, list);
				}
			}

			else {
				TreeMap<String, LinkedList> tmp = new TreeMap();
				LinkedList<String> list = new LinkedList();
				list.add("paid " + amount + " " + note);
				tmp.put(payee, list);
				transaction_payer.put(payer, tmp);
			}

//Transaction Payer end here

			tmap.get(payee).put("Bal",
					Integer.toString((Integer.parseInt(tmap.get(payee).get("Bal")) + Integer.parseInt(amount))));
			
			tmap.get(payer).put("Bal",
					Integer.toString((Integer.parseInt(tmap.get(payer).get("Bal")) - Integer.parseInt(amount)))); 
			System.out.println("Transaction Completed");
			System.out.println();
		}

	}

	void createUser(String str) {

		if (str.length() < 4)
			System.out.println("User name's length should be greater than or equals to 4");
		else if (str.length() > 15)
			System.out.println("User name's length should not be greater than 15");
		else {
			TreeMap<String, String> tmp;
			if (tmap == null) {
				tmap = new TreeMap();
				tmp = new TreeMap<String, String>();
				tmp.put("Bal", "0");
				tmap.put(str, tmp);
				System.out.println("User created");
				System.out.println();
			} else {
				if (tmap.containsKey(str))
					
				System.out.println("User Name already exist");
				else {
					tmp = new TreeMap<String, String>();
					tmp.put("Bal", "0");
					tmap.put(str, tmp);
					System.out.println("User created");
				}

			}

		}
	}

	boolean checkLuhn(String num) {
		int s1 = 0, s2 = 0, i;
		for (i = 0; i < num.length(); i += 2) {
			s1 += Integer.parseInt(new String(new StringBuffer().append(num.charAt(i))));
			if (i + 1 < num.length()) {
				int n = Integer.parseInt(new String(new StringBuffer().append(num.charAt(i + 1)))) * 2;
				while (n > 0) {
					s2 += (n % 10);
					n /= 10;
				}
			}
		}
		if ((s1 + s2) % 10 == 0)
			return (true);
		else
			return (false);
	}

	void add(String usr, String card_number) {
		if (tmap.containsKey(usr)) {
			if (cardset.size() == 0) {
				if (tmap.get(usr).get("card_no") == null) {
					if (checkLuhn(new String(new StringBuffer(card_number).reverse()).trim()) == true) {
						cardset.add(card_number);
						tmap.get(usr).put("card_no", card_number);
						System.out.println("Card number added to  " + usr);
						System.out.println();
					} else
						System.out.println("Invalid Card Number");
				} else
					System.out.println(usr + " already have a card number");

			} // if(cardset.size==0) end here
			else {
				if (cardset.contains(card_number))
					System.out.println("This Card Number already assigned to a user");
				else {
					if (tmap.get(usr).get("card_no") == null) {
						if (checkLuhn(new String(new StringBuffer(card_number).reverse())) == true) {
							cardset.add(card_number);
							tmap.get(usr).put("card_no", card_number);
							System.out.println("Card number added to  " + usr);
						} else
							System.out.println("Invalid Card Number");

					} else
						System.out.println(usr + " already have a card number");

				}
			}

		} else
			System.out.println("Invalid User Name");

	}

	void feed(String str) {

		if (transaction_payee.containsKey(str)) {
			TreeMap<String, LinkedList> tmap = transaction_payee.get(str);
			Set<Map.Entry<String, LinkedList>> set = tmap.entrySet();

			for (Map.Entry<String, LinkedList> map : set) {
				LinkedList<String> list = map.getValue();
				Iterator itr = list.iterator();
				while (itr.hasNext())
					System.out.println(map.getKey() + " " + itr.next());
			}
		}

		if (transaction_payer.containsKey(str)) {
			TreeMap<String, LinkedList> tmap = transaction_payer.get(str);
			Set<Map.Entry<String, LinkedList>> set = tmap.entrySet();

			for (Map.Entry<String, LinkedList> map : set) {
				LinkedList<String> list = map.getValue();
				Iterator itr = list.iterator();
				while (itr.hasNext())
					System.out.println("You " + " " + itr.next() + " to " + map.getKey());
			}
		}

	}// void feed(String str) end here

	void balanceUser(String cmd) {
		if (tmap.containsKey(cmd))
			System.out.println(tmap.get(cmd).get("Bal") + " $");
		else 
			System.out.println("Invalid User name");
	}// void balanceUser(String cmd) end here

}

class Solution {
	public static void main(String[] args) {
		Wallet obj = new Wallet();
		obj.menu();
	}
}

//49927398716
//371337822176423
//371398395631368
//343600827277842