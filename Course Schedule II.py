from collections import defaultdict
from typing import List

class Solution:
    def findOrder(self, numCourses: int, prerequisites: List[List[int]]) -> List[int]:
        graph = defaultdict(list)
        for dest, src in prerequisites:
            graph[src].append(dest)
        
        visited = [0] * numCourses  
        # visited states: 0 = unvisited, 1 = visiting, 2 = visited
        order = []
        self.is_possible = True
        
        def dfs(node):
            if visited[node] == 1:
                # Found a cycle
                self.is_possible = False
                return
            if visited[node] == 2:
                # Already processed this node
                return
            
            visited[node] = 1  # mark as visiting
            for nei in graph[node]:
                dfs(nei)
                if not self.is_possible:
                    return
            visited[node] = 2  # mark as visited
            order.append(node)
        
        for i in range(numCourses):
            if visited[i] == 0:
                dfs(i)
            if not self.is_possible:
                return []
        
        # order currently has reversed topological order
        order.reverse()
        return order
