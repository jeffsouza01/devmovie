import MovieStars from "components/MovieStars";
import "./styles.css";

function MovieScore() {

  const score = 4.5;
  const count = 15;

  return (
    <div className="devmovie-score-container">
      <p className="devmovie-score-value">{score > 0 ? score.toFixed(1) : '-'}</p>
      <MovieStars />
      <p className="devmovie-score-count">{count} avaliações</p>
    </div>

  );
}

export default MovieScore;