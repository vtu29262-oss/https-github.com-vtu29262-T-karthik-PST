class Checker implements java.util.Comparator<Player> {

    @Override
    public int compare(Player a, Player b) {

        // Higher score first
        if (a.score != b.score) {
            return Integer.compare(b.score, a.score);
        }

        // Same score -> alphabetical order by name
        return a.name.compareTo(b.name);
    }
}


nput (stdin)
5
amy 100
david 100
heraldo 50
aakansha 75
aleksa 150
Your Output (stdout)
aleksa 150
amy 100
david 100
aakansha 75
heraldo 50
Expected Output
aleksa 150
amy 100
david 100
aakansha 75
heraldo 50
