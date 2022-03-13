import {ReactComponent as GithubIcon} from "assets/img/github.svg";
import './styles.css';

function Navbar() {

  return (
    <header>
      <nav className="container">
        <div className="devmovie-nav-content">
          <h1> DevMovie</h1>
          <a href="https://github.com/jeffsouza01" target="_blank" rel="noreferrer">
            <div className="devmovie-contact-container">
              <GithubIcon />
              <p className="devmovie-contact-link">/Jeffsouza01</p>
            </div>
          </a>
        </div>
      </nav>
    </header>
  );
}

export { Navbar};