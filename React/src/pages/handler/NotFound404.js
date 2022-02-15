import React from 'react';
import { Link } from 'react-router-dom';

export default function NotFound() {
    return (
  <div>
    <h1>#404</h1>
    <h3>Você provavelmente acessou a página errada.</h3>
    <p>Verifique se o endereço está digitado corretamente, ou tente novamente mais tarde.</p><br></br>
    <Link to="/">Voltar à raíz do site</Link>
  </div>
)};
