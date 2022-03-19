import { ReactComponent as GithubIcon } from "assets/img/github.svg";
import { Link } from "react-router-dom";

import './styles.css';

function Navbar() {

    return (
        <header>
            <nav className="container">
                <div className="devmovie-nav-content">
                    <Link to={`/`}>
                        <h1> DevMovie</h1>
                    </Link>
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

export default Navbar;