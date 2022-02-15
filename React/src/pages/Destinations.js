import {
    BrowserRouter,
    Routes,
    Route, Outlet
} from "react-router-dom";
import * as Bootstrap from 'react-bootstrap';

export default function destinations() {
    return (
        <div>
            <h1>Bookkeeper</h1>
            <nav
                style={{
                    borderBottom: "solid 1px",
                    paddingBottom: "1rem"
                }}
            >
            </nav>

            <Outlet />
        </div>

    );
}
