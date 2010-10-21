module LabeledGraph

import Graph;
import Set;
import Relation;
import IO;

alias LGraph[&T,&L] = rel[&T from, &L label, &T to];

@doc{Return the bottom nodes of a LGraph}
public set[&T] bottom(LGraph[&T,&L] G)
{
  return G.to - G.from;
}

@doc{The predecessors of a single node in a LGraph}
public set[&T] predecessors(LGraph[&T,&L] G, &T From)
{
  return invert(G<from,to>)[From];
}

@doc{Reachability from start set}
public set[&T] reach(LGraph[&T,&L] G, set[&T] Start)
{
	return reach(G<from,to>, Start);
}

@doc{Reachability with restriction}
public set[&T] reachR(LGraph[&T,&L] G, set[&T] Start, set[&T] Restr)
{
	return reachR(G<from,to>, Start, Restr);
}

@doc{Reachability with exclusion}
public set[&T] reachX(LGraph[&T,&L] G, set[&T] Start, set[&T] Excl)
{
   return reachX(G<from,to>, Start, Excl);
}

@doc{The successor of a single node in a LGraph}
public set[&T] successors(LGraph[&T, &L] G, &T From)
{
  return G<from,to>[From];
}

@doc{Return the top nodes of a LGraph}
public set[&T] top(LGraph[&T,&L] G)
{
  return G.from - G.to;
}
