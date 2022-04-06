# CondominiumControl

READ ME

1. Every user system has an extends PersonData to get the basic informations;
2. Polimorfism was used with Trustee;
3. Once initialized an InternSystem or an OperatorMachine or a Trustee, you must call the 'setPassword()' method;
4. I used the Static type in the Crowded variable to count how many times the '.openDoor()' method was called, regardless of the instances
5. Only Authenticable can use this function, because an EngineRoom instance was only built from it;
6. The Authenticator was born to avoid repeating code and if in the future someone else comes along who can use the EngineRoom, just initialize an Authenticator instance in their constructor.;
7. Authenticator uses the interface Authenticable to allow the Trustee (that is a resident either) but not allow a common resident;


READ ME (PT-BR)

1. Todo sistema de usuário possui um PersonData extendido para obter as informações básicas;
2. Polimorfismo foi usado com Trustee;
3. Uma vez inicializado um InternSystem ou um OperatorMachine ou um Trustee, você deve chamar o método 'setPassword()';
4. Usei o tipo Static na variável Crowded para contar quantas vezes o método '.openDoor()' foi chamado, independentemente das instâncias
5. Somente Authenticable pode usar esta função, pois uma instância EngineRoom foi construída somente a partir dela;
6. O Authenticator nasceu para evitar a repetição de código e se no futuro aparecer alguém que possa usar o EngineRoom, basta inicializar uma instância do Authenticator em seu construtor.;
7. O autenticador usa a interface Authenticable para permitir o Trustee (que também é um residente), mas não permitir um residente comum;
